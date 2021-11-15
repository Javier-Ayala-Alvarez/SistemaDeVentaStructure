///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package arboles;
//
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author mejia
// */
//public class ArbolBB<T> extends ArbolBinario {
//
//    public ArbolBB() {
//        super();
//    }
//
//    public <T extends Comparable> void insertar(T dato) {
//        super.setRaiz(insertar(dato, super.getRaiz()));
//    }
//
//    private <T extends Comparable> Nodo insertar(T dato, Nodo r) {
//
//        if (r == null) {
//            r = new Nodo(dato);
//            
//        } else if (dato.compareTo(r.getDato()) < 0) {
//            Nodo izq;
//            izq = insertar(dato, r.getIzdo());
//            r.setIzdo(izq);
//
//        } else if (dato.compareTo(r.getDato()) > 0) {
//            Nodo drcho;
//            drcho = insertar(dato, r.getDcho());
//            r.setIzdo(drcho);
//
//        } else {
//            JOptionPane.showMessageDialog(null, "duplicado");
//        }
//        return r;
//    }
//
//    public ArrayList NID() {
//        ArrayList a = new ArrayList<>();
//        return super.preOrdenNID(super.getRaiz(), a);
//    }
//
//    public ArrayList IND() {
//        ArrayList a = new ArrayList<>();
//        return super.inOrdenNID(super.getRaiz(), a);
//    }
//
//    public ArrayList IDN() {
//        ArrayList a = new ArrayList<>();
//        return super.postOrdenNID(super.getRaiz(), a);
//    }
//
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import Estructura.ListaDoble;
import arboles.ArbolBinario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Javier
 */
public class ArbolBB<T> extends ArbolBinario {

    public ArbolBB() {
        super();
    }

    public <T extends Comparable> void insertar(T dato) {
        super.setRaiz(insertar(dato, super.getRaiz()));
    }

    private <T extends Comparable> Nodo insertar(T dato, Nodo r) {
        if (r == null) {
            r = new Nodo(dato);
        } else if (dato.compareTo(r.getDatos()) < 0) {
            Nodo izq;
            izq = insertar(dato, r.getIzdo());
            r.setIzdo(izq);
        } else if (dato.compareTo(r.getDatos()) > 0) {
            Nodo drch;
            drch = insertar(dato, r.getDcho());
            r.setDcho(drch);
        } else {
            JOptionPane.showConfirmDialog(null, "Duplicado");
        }
        return r;
    }
    
    public ArrayList NID(){
        ArrayList a = new ArrayList();
        return super.preOrdenNID(super.getRaiz(), a);
    }
     public ArrayList IND(){
        ArrayList a = new ArrayList();
        return super.inOrdenIND(super.getRaiz(), a);
    }
     public ArrayList IDN(){
        ArrayList a = new ArrayList();
        return super.posOrdenIDN(super.getRaiz(), a);
    }
     public ListaDoble <T> recorridoAmplitud(){
         return super.recorridoAmplitud(super.getRaiz());
     }
     
     public <T extends Comparable>void eliminar (T dato){
         super.setRaiz(eliminar(dato, super.getRaiz()));
     }
    private  <T extends Comparable>Nodo eliminar(T dato, Nodo r){
        if ( r == null) {
            JOptionPane.showMessageDialog(null, "no se encontro un nodo a eliminar");
            
        }else if(dato.compareTo(r.getDatos())<0){
            Nodo izdo = eliminar(dato, r.getIzdo());
            r.setIzdo(izdo);
        }else if(dato.compareTo(r.getDatos())>0){
            Nodo dcho ;
             dcho = eliminar(dato, r.getDcho());
            r.setDcho(dcho);
        }else{
            Nodo q = r;
            if (q.getIzdo() == null) {
                r = q.getDcho();
            }else if (q.getDcho() == null) {
                r = q.getIzdo();
            }else{ // caso cuando hay 2 ramas o 2 hijos
                q= reemplazar(q);
                
            }
        }
        return r;
    }
    private Nodo reemplazar(Nodo actual){
        Nodo a,p;
        p = actual;
        a = actual.getIzdo();
        while (a.getDcho() != null){
            p = a;
            a = a.getIzdo();
        }
        actual.setDatos(a.getDatos());
        if (p == actual) {
            p.setIzdo(a.getIzdo());
        }else{
            p.setDcho(a.getIzdo());
        }
        return a;
    }
    
    
   

}