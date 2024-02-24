/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author gp
 */

package clases;

import javax.swing.JOptionPane;

public class ListaCola {

    public static void main(String[] args) {
        
        
       Cola cola = new Cola(); // creamos un obejto el cual sera nuestra lista.
       
        System.out.println("Esta en un lista con colas primero en entras primero en salir ");
       cola.ColaVacia(); // con este metedo verificamos si la lista esta vacia o no.
       cola.Insertar(17); // creamos un nuevo nodo en este caso la mandamos un valor 
       cola.Insertar(35); // creamos otro nodo para ver como se llana la pila
       cola.Insertar(60);
       cola.MostrarContenido(); // muestra los nodos insertados
       cola.Eliminar(); // elimina una nodo de la lista
       cola.MostrarContenido();
       cola.Eliminar();
       cola.MostrarContenido(); // muestra la nueva lista ya con el nodo eliminado


    }
}
