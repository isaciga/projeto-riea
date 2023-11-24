// package com.projeto.riea.model;

// import java.util.ArrayList;

// public class InfoDAO{
//     private Database db;
//     private static InfoDAO instance;

//     public InfoDAO() {
//     }

//     public static InfoDAO getInstance(){
//         if(instance == null){
//             instance = new InfoDAO();
//         }
//         return instance;
//     }

//     private Database getConnection(){
//         if(this.db == null){            
//             Database db = new Database();
//             db.init();
//             this.db = db;
//         }
//         return this.db;    
//     }

//     public void create(Info novo){
//         Database db = getConnection();
//         db.criar(novo);
//     }   

//     public ArrayList<Info> read(){
//         Database db = getConnection();
//         return db.listaInfo();
//     }

//     public void delete(Info deletar) {
//         Database db = getConnection();
//         db.removerInfo(deletar);
//     }
// }