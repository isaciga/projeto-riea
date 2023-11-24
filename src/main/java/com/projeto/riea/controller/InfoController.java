package com.projeto.riea.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Info;

@RestController
public class InfoController {

    @DeleteMapping("/info/deletar")
    public void deletar(Info novo){
        Database.removerInfo(novo);
    }

    @GetMapping("/info/listar")
    public List<Info> listar(){
        return Database.listaInfo();
    }

    @PostMapping("/info")
    public void criar(@RequestBody Info novo){
        Database.criar(novo);
    }
}

