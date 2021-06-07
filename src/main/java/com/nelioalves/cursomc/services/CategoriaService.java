package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Transactional
    public List<Categoria> cadastrarCategorias(List<Categoria> categorias){
        return categoriaRepository.saveAll(categorias);
    }

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria buscarCategoriaPorId(Long id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow();
    }
}
