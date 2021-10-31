package Estructura;

import java.util.ArrayList;

    public class ListaDobleCircular<T> {

    private NodoDoble lista;

    public ListaDobleCircular() {
        this.lista = null;
    }

    public boolean isEmpty() {
        return lista == null;
    }

    public <T extends Comparable> void insertar(T dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (isEmpty()) {
            lista = nuevo;
            nuevo.setSiguiente(lista);//Nuevo
            lista.setAnterior(nuevo);
        } else if (dato.compareTo(lista.getDato()) < 0) {
            NodoDoble ultimo = ultimo();//agregar
            nuevo.setSiguiente(lista);
            lista.setAnterior(nuevo);
            lista = nuevo;
            ultimo.setSiguiente(lista);//Agregado
            lista.setAnterior(ultimo);

        } else {
            NodoDoble ant = ubicar(dato);
            nuevo.setSiguiente(ant.getSiguiente());
            if (ant.getSiguiente() != lista) {
                ant.getSiguiente().setAnterior(nuevo);
            }
            ant.setSiguiente(nuevo);
            nuevo.setAnterior(ant);
            
        }

    }

    public <T extends Comparable> void insertarInicio(T dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (!isEmpty()) {
            NodoDoble ultimo = ultimo();//agregar
            nuevo.setSiguiente(lista);
            lista.setAnterior(nuevo);
            lista = nuevo;
            ultimo.setSiguiente(lista);//Agregado
            lista.setAnterior(ultimo);
        } else {
           lista = nuevo;
            nuevo.setSiguiente(lista);//Nuevo
            lista.setAnterior(nuevo);
        }

    }

    public <T extends Comparable> void insertarFinal(T dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (!isEmpty()) {
            NodoDoble ultimo = ultimo();//agregar
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            nuevo.setSiguiente(lista);
            lista.setAnterior(ultimo);
        } else {
          lista = nuevo;
            nuevo.setSiguiente(lista);//Nuevo
            lista.setAnterior(nuevo);
        }

    }

    public <T extends Comparable> void insertarAntes(T dato, T condicion) {
        NodoDoble nuevo = new NodoDoble(dato);

        if (!isEmpty()) {
            NodoDoble encontrado = antesDe(condicion);
            NodoDoble ultimo = ultimo();
            if (encontrado != null && encontrado.getAnterior() != ultimo) {
                nuevo.setAnterior(encontrado.getAnterior());
                encontrado.getAnterior().setSiguiente(nuevo);
                nuevo.setSiguiente(encontrado);
                encontrado.setAnterior(nuevo);
            }else if(encontrado.getAnterior() == ultimo){
            nuevo.setSiguiente(lista);
            lista.setAnterior(nuevo);
            lista = nuevo;
            ultimo.setSiguiente(lista);//Agregado
            lista.setAnterior(ultimo);
            
            }else{             
                nuevo.setSiguiente(encontrado);          
                encontrado.setAnterior(nuevo);
                ultimo.setSiguiente(nuevo);                
            }
               
        } else {
            lista = nuevo;
            nuevo.setSiguiente(lista);//Nuevo
            lista.setAnterior(nuevo);
        }
    }

    public <T extends Comparable> NodoDoble antesDe(T condicion) {
        NodoDoble aux = lista;
        //condicion!= (aux.getDato()) 
        while (condicion.toString().compareTo(aux.getDato().toString()) !=0) {
                aux = aux.getSiguiente();
        }
        System.out.println(condicion.toString());
        System.out.println(aux.getDato().toString() + "/n s");
        return aux;
    }

    private NodoDoble ultimo() {
        NodoDoble aux = lista;
        while ((aux.getSiguiente()) != lista) {
            aux = aux.getSiguiente();
        }
        return aux;
    }

    private <T extends Comparable> NodoDoble ubicar(T dato) {
        NodoDoble aux = lista, ant = lista;

        while (aux.getSiguiente() != lista && dato.compareTo(aux.getDato()) > 0) {
            ant = aux;
            aux = aux.getSiguiente();
        }
        if (dato.compareTo(aux.getDato()) > 0) {
            ant = aux;

        }
        return ant;

    }

    public ArrayList<T> toArrayAsc() {
        NodoDoble aux = lista;
        ArrayList<T> array = new ArrayList();
        if (!isEmpty()) {//agregado
            do {
                array.add((T) aux.getDato());
                aux = aux.getSiguiente();
            } while (aux != lista);//modificado
        }

        return array;

    }

    public ArrayList<T> toArrayDes() {
        NodoDoble aux = lista;
        if (!isEmpty()) {//agregado
            do {
                aux = aux.getSiguiente();
            } while (aux.getSiguiente() != lista);//modificado
        }
        ArrayList<T> array = new ArrayList();

        if (!isEmpty()) {//agregado
            do {
                array.add((T) aux.getDato());
                aux = aux.getAnterior();
            } while (aux != lista);//modificado
            array.add((T) aux.getDato());
        }
        return array;
    }

    public <T extends Comparable> NodoDoble buscar(T dato) {
        NodoDoble aux = lista;
        if (aux != null) {
            do {
                if (dato.compareTo(aux.getDato()) == 0) {
                    return aux;
                }
                aux = aux.getSiguiente();
            } while (aux != lista);
        }
        return null;
    }

    public <T extends Comparable> void eliminar(T dato) {
        NodoDoble quitar = buscar(dato);

        if (quitar != null) {
            if (quitar == lista) {

                if (lista.getSiguiente() != lista) {//agregar
                    NodoDoble ultimo = ultimo();//agregar
                    lista = quitar.getSiguiente();
                    ultimo.setSiguiente(lista);//agregar
                } else {//
                    lista = null;
                }
            } else {
                NodoDoble ant = ubicar(dato);
                ant.setSiguiente(quitar.getSiguiente());
                if (quitar.getSiguiente() != lista) {
                    quitar.getSiguiente().setAnterior(ant);
                }
            }
        }
        quitar = null;

    }

 

}
