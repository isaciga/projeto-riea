package com.projeto.riea.model;

public class Conteudo{
    private String id;
    private String nome;
    private String materia;
    private String tipo;

    public Conteudo() {
    }

    public Conteudo(String id, String nome, String materia, String tipo) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}