package com.projeto.riea.model;

public class Info{
    private String id;
    private String tema;
    private String conteudo;

    public Info() {
    }

    public Info(String id, String tema, String conteudo) {
        this.id = id;
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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