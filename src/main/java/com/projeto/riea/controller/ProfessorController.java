package com.projeto.riea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Professor;
import com.projeto.riea.repository.ProfessorRepository;

@RestController
public class ProfessorController {
    @Autowired
    ProfessorRepository professorRepository;

    @DeleteMapping("/professor/deletar/{id}")
    public void deletar(@PathVariable("id") Long id){
        professorRepository.deleteById(id);
    }

    @GetMapping("/professor/listar")
    public List<Professor> listar(){
        return (List<Professor>) professorRepository.findAll();
    }

    @PostMapping("/professor")
    public Professor criar(@RequestBody Professor novo){
        return professorRepository.save(novo);
    }
}

