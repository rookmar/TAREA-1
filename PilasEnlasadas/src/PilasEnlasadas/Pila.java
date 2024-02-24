/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gp
 */
package PilasEnlasadas;

import javax.swing.JOptionPane;

public class Pila {
    
    // nuestras variables declaradas de la clase Pila
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    // construtor para llenar cada nodo de la lista de pila
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Método para insertar un nodo en la lista de pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nocdo = new Nodo(nodo);
        nuevo_nocdo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nocdo;
        tamano++;
    }        
    
    //Método para eliminar un nodo en la lsita de pila el el utlimo en entrar primero en salir
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }

    //Método para mostrar el contenido de la lista de pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        System.out.println("La lista de nodos es: " +" \n"+ Lista);
        Lista = "";
    }
}
