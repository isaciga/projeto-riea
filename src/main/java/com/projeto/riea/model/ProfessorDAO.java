package com.projeto.riea.model;

import java.util.ArrayList;

public class ProfessorDAO{
    private Database db;
    private static ProfessorDAO instance;

    public ProfessorDAO() {
    }

    public static ProfessorDAO getInstance(){
        if(instance == null){
            instance = new ProfessorDAO();
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

    public void create(Professor novo){
        Database db = getConnection();
        db.criar(novo);
    }   

    public ArrayList<Professor> read(){
        Database db = getConnection();
        return db.listaProfessor();
    }

    public void delete(Professor deletar) {
        Database db = getConnection();
        db.removerProfessor(deletar);
    }
}