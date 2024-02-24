/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gp
 */
package PilasEnlasadas;
// nuestra clase nodo para ir lleando y darle direccion
public class Nodo {
    int informacion;
    Nodo siguiente;
    // construtor para insertar los nodos en la pila
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
}
