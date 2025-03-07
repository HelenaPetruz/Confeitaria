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
        String sql = "select descricao from `confeitaria-produto` where idProduto=idProduto";
        jdbcTemplate.execute(sql);
        return null;
    }

    @Override
    public Produto add(Produto produto) {
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
