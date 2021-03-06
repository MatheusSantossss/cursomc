package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoResource {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos(){
        return null;
    }

    @GetMapping(path = "/{categoria}")
    public Produto buscarProdutoPorCategoria(@PathVariable Long categoria){
        return  null;
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto){
        return null;
    }

    @PostMapping(path = "/lista-produtos")
    public List<Produto> cadastrarListaProdutos(@RequestBody List<Produto> produtos){
        return null;
    }

    @DeleteMapping(path = "/{produto}")
    public Produto deletarProduto(@PathVariable Long produto){
        return null;
    }

}
