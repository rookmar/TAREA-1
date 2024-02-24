/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gp
 */
package clases;

import javax.swing.JOptionPane;
// la clase que nos ayudara para crear la lista
public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    // constructor con parametros para iniciar y finalizar la lista
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar a la cola un nodo
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    //Método para eliminar de la cola un nodo
    public int Eliminar(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola en lista 
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " +cadena[i];                    
        }
        
        System.out.println("la lista de nodos es: " + ColaInvertida);
        Cola = "";
    }
}
