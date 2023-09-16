package com.projeto.riea.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Database;
import com.projeto.riea.model.Conteudo;

@RestController
public class ConteudoController {

    @DeleteMapping("/conteudo/deletar")
    public void deletar(Conteudo novo){
        Database.removerConteudo(novo);
    }

    @GetMapping("/conteudo/listar")
    public List<Conteudo> listar(){
        return Database.listaConteudo();
    }

    @PostMapping("/conteudo")
    public void criar(@RequestBody Conteudo novo){
        Database.criar(novo);
    }
}

