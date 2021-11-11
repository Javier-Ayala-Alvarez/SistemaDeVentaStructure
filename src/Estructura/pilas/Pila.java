/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura.pilas;

import java.util.ArrayList;

/**
 *
 * @author Francisco Javier
 */
public class Pila <T>{
    private Nodo<T> pilita;

    public Pila() {
        pilita = null;
    }
    public boolean isEmpty(){
        return pilita == null;
    }
    public void push(T d){
        Nodo nuevoNodo = new Nodo(d,pilita);
        pilita = nuevoNodo;
    }
    public T pop(){
        T cima = (T) "Pila vacia";
        if(!isEmpty()){
            cima = pilita.getDato();
            pilita = pilita.getSiguiente();
        }
        return cima;
    }
    public T peek(){
        return pilita.getDato();
    }
    public ArrayList<T> toArray(){
        Nodo aux = pilita;
        ArrayList<T> array = new ArrayList();
        while(aux != null){
            array.add((T)aux.getDato());
            aux = aux.getSiguiente();
        }
        return array;
    } 
}
