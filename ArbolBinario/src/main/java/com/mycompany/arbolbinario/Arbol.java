/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author gp
 */
public class Arbol {
    
       // creamos los constructores
    public class Nodo{
    
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        
        public Nodo(int indice){
        llave = indice;
        derecha=null;
        izquierda=null;
        padre=null;

    }

    }
        
 // creamos un construscor con la varible raiz
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }
    
    //este metodo nos ayuda a insenter un nodo en el arbol
    public void insertar(int i){
        Nodo n = new Nodo(i);
        
        // verificamos si el arbol aun no esta creado 
        if (raiz==null) {
            raiz=n;
        }else{
            // si ya esta creado verficaremos donde colocar el nodo
            Nodo aux = raiz;

            while(aux != null){
                
                n.padre = aux;
                // si el nodo es mayor al nodo padre se va a la derecha
                if (n.llave >= aux.llave) {
                    aux=aux.derecha;
                }else{
                    //si es menos que el nodo padre se a la izquierda
                    aux=aux.izquierda;
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            }else{
                n.padre.derecha=n;
            }
        }
    }
   
    // creamos un meto para recorrer y mostras los datos.
    public void recorrer(Nodo n){
        if (n != null) {

            recorrer(n.izquierda);
            System.out.println("NODO = " +n.llave);
            recorrer(n.derecha);
        }
    }
    
  

    
}
