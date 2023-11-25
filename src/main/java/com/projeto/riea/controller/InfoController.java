package com.projeto.riea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.riea.model.Info;
import com.projeto.riea.repository.InfoRepository;

@RestController
public class InfoController {
    @Autowired
    InfoRepository infoRepository;

    @DeleteMapping("/info/deletar/{id}")
    public void deletar(@PathVariable("id") Long id){
        infoRepository.deleteById(id);
    }

    @GetMapping("/info/listar")
    public List<Info> listar(){
        return (List<Info>) infoRepository.findAll();
    }

    @PostMapping("/info")
    public Info criar(@RequestBody Info novo){
        return infoRepository.save(novo);
    }
}

