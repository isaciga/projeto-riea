package com.projeto.riea.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static ArrayList<Info> informações;

    public Database() {
        informações = new ArrayList<>();
    }

    public static void init(){
        informações = new ArrayList<Info>();
        informações.add(new Info("11", "O que é autismo?", "o autismo é um transtorno..."));
    }
    
    public static void criar(Info novo){
        informações.add(novo);
    }

    public static ArrayList<Info> listaInfo(){
        return informações;
    }

    public static void removerInfo(Info novo) {
        informações.add(novo);
    }

    public static List<Info> all(){
        return informações;
    }
}
