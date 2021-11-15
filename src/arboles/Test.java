/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author mejia
 */
//public class Test {
//    public static void main(String[] args) {
//        
//       ArbolBB arbol = new ArbolBB();
//        
//        
//        arbol.insertar(5);
//        arbol.insertar(75);
//        arbol.insertar(675);
//        arbol.insertar(9);
//        arbol.insertar(89);
//        arbol.insertar(54);
//        arbol.insertar(23);
//        arbol.insertar(12);
//        arbol.insertar(458);
//        arbol.insertar(46);
//        arbol.insertar(63);
//        arbol.insertar(2);
//        
//        
//        
//        //System.out.println(arbol.contains(5));
//        
//        
//       //arbol.IDN();
//       for(Object x : arbol.IDN()){
//           System.out.println(x.toString());
//           
//       }
//    }
//    
//}
public class Test {

    public static void main(String[] args) {
        ArbolBB arbol = new ArbolBB();
//        TreeSet<Integer> arbol = new TreeSet();
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(9);
        arbol.insertar(2);
//        arbol.add(3);
//        arbol.add(9);
//        arbol.add(2);
//        System.out.println(arbol.contains(20));
//        System.out.println("");
//        for(Iterator<Integer>it=arbol.iterator();it.hasNext();){
//            System.out.println(it.next());
//        }

        arbol.eliminar(2);
        System.out.println("");
        for (Object it : arbol.IND()) {
            System.out.println(it.toString());
        }
        
        System.out.println("-----------------");
        System.out.println(arbol.IND());
        System.out.println(arbol.buscar(2));
    }
}