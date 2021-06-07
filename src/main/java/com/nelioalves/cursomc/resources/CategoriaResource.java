package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.POST)
    public List<Categoria> cadastrarCategorias(@RequestBody List<Categoria> categorias){
        categoriaService.cadastrarCategorias(categorias);
        return categorias;
    }

    @GetMapping(path = "/listar-categorias")
    public List<Categoria> listarCategorias(){
        return categoriaService.listarCategorias();
    }

    @GetMapping(path = "/{id}")
    public Categoria buscarCategoriaPorId(@PathVariable Long id){
        return categoriaService.buscarCategoriaPorId(id);
    }

}
