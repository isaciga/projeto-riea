package com.projeto.riea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Database;
import com.projeto.riea.model.Aluno;
import com.projeto.riea.model.AlunoDAO;

@RestController
public class AlunoController {

    @DeleteMapping("/cadastro/deletar")
    public void deletar(Aluno novo){
        Database.removerAluno(novo);
    }

    @GetMapping("/cadastro/listar")
    public List<Aluno> listar(){
        return Database.listaAluno();
    }

    @PostMapping("/cadastro")
    public void criar(@RequestBody Aluno novo){
        Database.criar(novo);
    }
}

