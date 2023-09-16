package com.projeto.riea.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Database;
import com.projeto.riea.model.Professor;

@RestController
public class ProfessorController {

    @DeleteMapping(path = "/professor/deletar")
    public void deletar(Professor novo){
        Database.removerProfessor(novo);
    }

    @GetMapping(path = "/professor/listar")
    public List<Professor> listar(){
        return Database.listaProfessor();
    }

    @PostMapping(path = "/professor")
    public void criar(@RequestBody Professor novo){
        Database.criar(novo);
    }
}

