/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gp
 */
package PilasEnlasadas;

import javax.swing.JOptionPane;

public class PilasEnlasadas {

    public static void main(String[] args) {

        // creamos un objeto pila para lleanar nuesta lista de pila
        Pila pila = new Pila();
        
        pila.InsertarNodo(25); //ingresamos datos a un nodo
        pila.InsertarNodo(89); //ingresamos datos a un nodo
        pila.InsertarNodo(6);  //ingresamos datos a un nodo
        pila.MostrarValores(); // muestras la lista de la pila 
        pila.EliminarNodo(); // elimina  el ultimo nodo a insertar ya que es pila ultimo en entrar primero en salir
        pila.MostrarValores(); // muestra los valores de la lista
        
              
    }
}
