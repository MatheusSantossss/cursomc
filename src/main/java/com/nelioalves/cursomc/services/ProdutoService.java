package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.repositories.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRespository produtoRespository;

    public List<Produto> listarProdutos(){
        return produtoRespository.findAll();
    }

}
