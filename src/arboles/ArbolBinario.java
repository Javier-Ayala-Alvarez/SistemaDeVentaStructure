//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import Estructura.ListaDoble;
import Estructura.ListaDobleCircular;
import arboles.Nodo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Francisco Javier
 */
public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }
    //Visitar la raiz
    //ir al subarbol izquierdo
    //ir al subarbol derecho

    protected ArrayList preOrdenNID(Nodo r, ArrayList a) {
        if (r != null) {
            a.add(r.getDatos());
            preOrdenNID(r.getIzdo(), a);
            preOrdenNID(r.getDcho(), a);

        }
        return a;
    }
//Ir al subárbol izquierdo
//Visitar la raíz
//Ir al subárbol derecho

    protected ArrayList inOrdenIND(Nodo r, ArrayList a) {
        if (r != null) {
            inOrdenIND(r.getIzdo(), a);
            a.add(r.getDatos());
            inOrdenIND(r.getDcho(), a);
        }
        return a;
    }
// Ir al subárbol izquierdo
//Ir al subárbol derecho
//Visitar la raíz

    protected ArrayList posOrdenIDN(Nodo r, ArrayList a) {
        if (r != null) {
            posOrdenIDN(r.getIzdo(), a);
            posOrdenIDN(r.getDcho(), a);
            a.add(r.getDatos());
        }
        return a;
    }

    public <T extends Comparable> Nodo buscar(T datos) {
        return buscar(datos, raiz);
    }

    private <T extends Comparable> Nodo buscar(T datos, Nodo r) {
        if (r == null) {
            return null;
        } else if (datos.compareTo(r.getDatos()) == 0) {
            return r;
        } else if (datos.compareTo(r.getDatos()) < 0) {
            return buscar(datos, r.getIzdo());
        } else {
            return buscar(datos, r.getDcho());
        }

    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    protected <T> ListaDoble recorridoAmplitud(Nodo raiz) {
        // creamos un cola      
        Queue<Nodo<T>> cola = new LinkedList<Nodo<T>>();
        
        // encolamos la raiz     
        cola.add(raiz);
        
        //creamos la lista
        ListaDoble datos = new ListaDoble();
        
        // iteramos mientras que la cola no quede vacia     
        while (!cola.isEmpty()) {
            // desencolamos un elemento      
            Nodo<T> n = cola.poll();
            // lo procesamos    
            datos.insertar((Comparable) n.getDatos());
            System.out.println("-"+ n.getDatos());
            // si el nodo desencolado tiene hijo izquierdo => lo encolamos   
            if (n.getIzdo() != null) {
                cola.add(n.getIzdo());
            }
            // idem con el hijo derecho    
            if (n.getDcho() != null) {
                cola.add(n.getDcho());
            }
        }
        return datos;
    }

}
