///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package arboles;
//
///**
// *
// * @author mejia
// */
//public class Nodo <T>{
//    private T dato;
//    private Nodo izdo;
//    private Nodo dcho;
//    
//    
//    public  Nodo(T dato){
//        this.dcho = null;
//        this.izdo = null;
//        this.dato =null;
//    }
//    
//    public Nodo(T dato,Nodo izdo ,Nodo dcho){
//        this.dato = dato;
//        this.izdo = izdo;
//        this.dcho= dcho;
//    }
//
//    public T getDato() {
//        return dato;
//    }
//
//    public void setDato(T dato) {
//        this.dato = dato;
//    }
//
//    public Nodo getIzdo() {
//        return izdo;
//    }
//
//    public void setIzdo(Nodo izdo) {
//        this.izdo = izdo;
//    }
//
//    public Nodo getDcho() {
//        return dcho;
//    }
//
//    public void setDcho(Nodo dcho) {
//        this.dcho = dcho;
//    }
//
//    @Override
//    public String toString() {
//        return (String) dato ;
//    }
//    
//    
//    
//    
//}
package arboles;


public class Nodo <T>{
    private T datos;
    private Nodo izdo;
    private Nodo dcho;

    public Nodo() {
    }

    public Nodo(T datos) {
        this.datos = datos;
        this.izdo=null;
        this.dcho=null;
    }

    public Nodo(T datos, Nodo izdo, Nodo dcho) {
        this.datos = datos;
        this.izdo = izdo;
        this.dcho = dcho;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

    @Override
    public String toString() {
        return datos +"";
    }
    
    
}
