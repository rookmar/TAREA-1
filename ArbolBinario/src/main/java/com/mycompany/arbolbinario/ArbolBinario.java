/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;

/**
 *
 * @author gp
 */
public class ArbolBinario {

    public static void main(String[] args) {
        
        // creamos un objeto arbol
        Arbol arbol = new Arbol();
        
        arbol.insertar (5);
        arbol.insertar(3);
        arbol.insertar(8);
        arbol.insertar(4);
        arbol.insertar(10);
        arbol.insertar(40);
        
        
        // imprimimos en consala los nodos
        System.out.println("ARBOL ");
        arbol.recorrer(arbol.raiz);
        System.out.println("NODOS IZQUIERDA");
        arbol.recorrer(arbol.raiz.izquierda);
        System.out.println("NODOS DERECHA");
        arbol.recorrer(arbol.raiz.derecha);
        
        
    }
}
