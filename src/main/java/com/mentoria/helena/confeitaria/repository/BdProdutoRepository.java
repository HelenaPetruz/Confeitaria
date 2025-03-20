package com.mentoria.helena.confeitaria.repository;

import com.mentoria.helena.confeitaria.classes.Produto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
        return jdbcTemplate.queryForObject(sql, new Object[]{idProduto}, (rs, rowNum) -> { //expressão lambda - não entendi direito
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
        //return jdbcTemplate.update(sql, new Object[]{produto.getDescricao(), produto.getPreco(), produto.getCategoria(), produto.getValidade()});
        return null;
    }

    @Override
    public void update(Produto produto) {

    }

    @Override
    public void remove(int idProduto) {

    }

    @Override
    public List<Produto> getList() {
        return List.of();
    }
}
