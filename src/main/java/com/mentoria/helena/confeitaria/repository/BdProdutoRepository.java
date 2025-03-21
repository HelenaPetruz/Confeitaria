package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Slf4j
@Primary
@Repository
public class BdProdutoRepository implements IProdutoRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Produto get(int idProduto) {
        log.info("caiu no metodo do bd");
        String sql = "select descricao from `confeitaria-produto` where idProduto=?";
        //jdbcTemplate.execute(sql);

        //Método queryForObject(sql, parametros da query, tipo de retorno) - para buscar um valor no bd
        return jdbcTemplate.queryForObject(sql, new Object[]{idProduto}, (rs, rowNum) -> { //expressão lambda = RowMapper
            Produto produto = new Produto(
                    rs.getString("descricao"),
                    rs.getDouble("preco"),
                    rs.getString("categoria"),
                    rs.getTimestamp("validade").toString()
            );
            produto.setIdProduto(rs.getInt("idProduto"));
            return produto;
        });
    }

    @Override
    public Produto add(Produto produto) {
        String sql = "insert into `confeitaria-produto` (descricao, preco, categoria, validade) values: (?, ?, ?, ?)";
        //Método update - para INSERT, UPDATE e DELETE
        /*return jdbcTemplate.update(sql, new Object[]{produto.getDescricao(), produto.getPreco(), produto.getCategoria(), produto.getValidade()}, (rs, rowNum) -> { //expressão lambda = RowMapper
                Produto retorno = new Produto(
                        rs.getString("descricao"),
                        rs.getDouble("preco"),
                        rs.getString("categoria"),
                        rs.getTimestamp("validade").toString()
                );
                produto.setIdProduto(rs.getInt("idProduto"));
                return produto;
                });*/
        return null;
    }

    @Override
    public void update(Produto produto) {
        //Método update - para INSERT, UPDATE e DELETE
        jdbcTemplate.update("update `confeitaria-produto` set descricao = ?, preco = ?, categoria = ?, validade = ?, where idProduto = ?",
                produto.getDescricao(), produto.getPreco(), produto.getCategoria(), produto.getValidade(), produto.getIdProduto());
    }

    @Override
    public void remove(int idProduto) {
        //Método update - para INSERT, UPDATE e DELETE
        jdbcTemplate.update("delete from `confeitaria-produto` where idProduto = ?", idProduto);
    }

    @Override
    public List<Produto> getList() {

        //método query() --> busca + de 1 valor no BD
        return jdbcTemplate.query("select * from `confeitaria-produto`", new RowMapper() {

            //Método mapRow(resultado da query, numero da coluna) --> transforma cada linha do resultSet (o resultado da minha query) num objeto do tipo Produto
            public Produto mapRow(ResultSet rs, int rowNum) throws SQLException {
                Produto produto = new Produto(
                        rs.getString("descricao"),
                        rs.getDouble("preco"),
                        rs.getString("categoria"),
                        rs.getTimestamp("validade").toString()
                );
                produto.setIdProduto(rs.getInt("idProduto"));
                return produto;
            }
        });
    }
