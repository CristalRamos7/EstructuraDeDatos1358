/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.doble.ligada;

/**
 *
 * @author Cristal Ramos
 */
public class Nodo <T> {
 private T data;
    private Nodo<T> Siguiente;
    private Nodo<T> Anterior;

    //Constructor por defecto
    public Nodo() { 
    }
    
    //Constructor sobrecargado, solo dato
    public Nodo(T data) {  
        this.data = data;
    }
    
    //Constructor sobrecargado 
    public Nodo(T dato, Nodo<T> Sig, Nodo<T> Ant) { 
        this.data = dato;
        this.Siguiente = Sig;
        this.Anterior = Ant;
    }


    public Nodo<T> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo<T> Sig) {
        this.Siguiente = Sig;
    }
    
    public Nodo<T> getAnterior(){
        return Anterior;
    }
    
    public void setAnterior(Nodo<T> Ant){
        this.Anterior = Ant;
    }

    public T getData() {
        return data;
    }

    public void setData(T dato) {
        this.data = dato;
    }

    
    @Override
    public String toString() {
        return "<-" + data + "-> ";
    }

    public String mostrarTodo() {
       return "[Anterior= "+ this.getAnterior() + "] -><- [Dato= " + data + "] -><- [Siguiente= " + this.getSiguiente() + "]";
    }
}

    

    
    
 

