package com.projeto.riea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Info{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tema;
    private String conteudo;

    public Info() {
    }

    public Info(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return tema;
    }

    public void setTelefone(String tema) {
        this.tema = tema;
    }

    public String getTipo() {
        return conteudo;
    }

    public void setTipo(String conteudo) {
        this.conteudo = conteudo;
    }
}