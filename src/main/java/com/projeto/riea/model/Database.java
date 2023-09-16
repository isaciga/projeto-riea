package com.projeto.riea.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Database {
    private static ArrayList<Professor> professores;

    public Database() {
        professores = new ArrayList<>();
    }

    public static void init(){
        professores = new ArrayList<Professor>();
        professores.add(new Professor("3", "Beatriz", "bia@gmail.com", "49327825"));
    }
    
    public static void criar(Professor novo){
        professores.add(novo);
    }

    public static ArrayList<Professor> listaProfessor(){
        return professores;
    }

    public static void removerProfessor(Professor novo) {
        professores.add(novo);
    }

    public static List<Professor> all(){
        return professores;
    }
}
