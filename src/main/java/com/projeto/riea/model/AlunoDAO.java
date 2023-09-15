package com.projeto.riea.model;

import java.util.ArrayList;

public class AlunoDAO{
    private Database db;
    private static AlunoDAO instance;

    public AlunoDAO() {
    }

    public static AlunoDAO getInstance(){
        if(instance == null){
            instance = new AlunoDAO();
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

    public void create(Aluno novo){
        Database db = getConnection();
        db.criar(novo);
    }   

    public ArrayList<Aluno> read(){
        Database db = getConnection();
        return db.listaAluno();
    }

    public void delete(Aluno deletar) {
        Database db = getConnection();
        db.removerAluno(deletar);
    }
}