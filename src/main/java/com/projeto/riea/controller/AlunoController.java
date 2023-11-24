package com.projeto.riea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Aluno;
import com.projeto.riea.repository.AlunoRepository;

@RestController
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepository;

    @DeleteMapping("/cadastro/deletar/{id}")
    public void deletar(@PathVariable "id" Long id){
        alunoRepository.deleteById(id);
    }

    @GetMapping("/cadastro/listar")
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

    @PostMapping("/cadastro")
    public void criar(@RequestBody Aluno novo){
        
    }
}

