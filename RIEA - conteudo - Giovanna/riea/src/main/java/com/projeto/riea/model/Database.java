package com.projeto.riea.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static ArrayList<Conteudo> conteudos;

    public Database() {
        conteudos = new ArrayList<>();
    }

    public static void init(){
        conteudos = new ArrayList<Conteudo>();
        conteudos.add(new Conteudo("7", "Aprendendo o alfabeto", "portugues", "vídeo"));
    }
    
    public static void criar(Conteudo novo){
        conteudos.add(novo);
    }

    public static ArrayList<Conteudo> listaConteudo(){
        return conteudos;
    }

    public static void removerConteudo(Conteudo novo) {
        conteudos.add(novo);
    }

    public static List<Conteudo> all(){
        return conteudos;
    }
}
