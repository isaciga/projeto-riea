package com.projeto.riea.model;

import java.util.ArrayList;

public class ConteudoDAO{
    private Database db;
    private static ConteudoDAO instance;

    public ConteudoDAO() {
    }

    public static ConteudoDAO getInstance(){
        if(instance == null){
            instance = new ConteudoDAO();
        }
        return instance;
    }

    private Database getConnection(){
        if(this.db == null){            
            Database db = new Database();
            db.init();
            this.db = db;
        }
        return this.db;    
    }

    public void create(Conteudo novo){
        Database db = getConnection();
        db.criar(novo);
    }   

    public ArrayList<Conteudo> read(){
        Database db = getConnection();
        return db.listaConteudo();
    }

    public void delete(Conteudo deletar) {
        Database db = getConnection();
        db.removerConteudo(deletar);
    }
}