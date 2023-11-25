package com.projeto.riea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Conteudo;
import com.projeto.riea.repository.ConteudoRepository;

@RestController
public class ConteudoController {

    @Autowired
    ConteudoRepository conteudoRepository;

    @DeleteMapping("/conteudo/deletar/{id}")
    public void deletar(@PathVariable("id") Long id){
        conteudoRepository.deleteById(id);
    }

    @GetMapping("/conteudo/listar")
    public List<Conteudo> listar(){
        return (List<Conteudo>) conteudoRepository.findAll();
    }

    @PostMapping("/conteudo")
    public Conteudo criar(@RequestBody Conteudo novo){
        return conteudoRepository.save(novo);
    }
}

