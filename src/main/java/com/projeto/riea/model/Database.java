package com.projeto.riea.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Database {
    private static ArrayList<ALuno> alunos;

    public Database() {
        alunos = new ArrayList<>();
    }

    public static void init(){
        alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("1", "Jose", "jose@gmail.com", "40320922", "aluno"));
    }
    
    public static void criar(Aluno novo){
        alunos.add(novo);
    }

    public static ArrayList<Aluno> listaAluno(){
        return alunos;
    }

    public static void removerAluno(Aluno novo) {
        alunos.add(novo);
    }

    public static List<Aluno> all(){
        return alunos;
    }
}
