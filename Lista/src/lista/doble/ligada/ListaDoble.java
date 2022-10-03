/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.doble.ligada;

/**
 *
 * @author Cristal Ramos
 */
public class ListaDoble <T> {
Nodo<T> head;
    int tamanio;

    public ListaDoble() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        Nodo<T> nuevo = this.head;
        int tam = 0;
        if (estaVacia() == false) {
            while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();
                tam = tam + 1;
            }
            return tamanio = tam + 1;
        } else {
            return tamanio = 0;
        }

    }

    public void agregarAlFinal(T valor) {
        Nodo<T> nuevo = new Nodo(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } 
        //5-> <-6
        
        else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                nuevo.setAnterior(aux);
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            aux = null;
            nuevo = null;
        }
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> nuevo = new Nodo(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            head.setAnterior(nuevo);
            this.head = nuevo;

        }

    }

    public void agregarDespuesDe(int posicion, T valor) {
        Nodo<T> nuevo = new Nodo(valor);
        Nodo<T> aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.getSiguiente().setAnterior(nuevo);
        aux.setSiguiente(nuevo);
    }

    public void eliminar(int posicion) {
   
        Nodo<T> aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(aux.getAnterior());
    }

    public void eliminarElPrimero() {

        if (this.estaVacia()) {
            System.out.println("Esta vacia");
        } else {
            Nodo<T> nuevo = head.getSiguiente();
            head = nuevo;
            head.setAnterior(null);

        }

    }

    public void eliminarElFinal() {
        Nodo<T> nuevo = this.head;
        int tam = getTamanio() - 1;
        Nodo<T> aux = this.head;

        for (int contador = 1; contador <= tam - 1; contador++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(aux);

    }

    public int buscarValor(T valor) {
        Nodo<T> nuevo = this.head;
        int posicion = 1;
        while (nuevo.getSiguiente() != null) {

            if (nuevo.getData() != valor) {
                posicion += 1;
                nuevo = nuevo.getSiguiente();
            } else {
                break;
            }

        }
        return posicion;
    }

    public void modificarValor(T antiguo, T nuevo) {

        Nodo<T> aux = this.head;

        while (aux.getSiguiente() != null) {

            if (aux.getData() == antiguo) {
                aux.setData(nuevo);
                break;
            }
            if (aux.getData() != antiguo) {

                aux = aux.getSiguiente();

            }
            if (aux.getData() == antiguo) {
                aux.setData(nuevo);
                break;
            }

        }

    }

    public void transversal() {
        Nodo actual = this.head;
        while (actual != null) {
            System.out.print(actual);
            actual = actual.getSiguiente();
        }
        System.out.println("");
    }

    public void transversal(String direccion) {

        if ("derecha".equals(direccion)) {           
           
           for(int i=1;i<=getTamanio();i++){
               System.out.print("|"+alrevez(i)+"|"+" <-> ");
               
           }
            System.out.println("");
            
        }

        if ("izquierda".equals(direccion)) {
            Nodo actual = this.head;
            while (actual != null) {
                System.out.print(actual);
                actual = actual.getSiguiente();
            }
            System.out.println("");

        }

    }
    
    public int alrevez(int rep){        
        Nodo<T> aux = this.head;            
            int s=getTamanio();         
                
             while (s != rep){                
                aux = aux.getSiguiente();
                if(aux.getSiguiente()==null){break;}
                s=s-1;                
            }
            
        int dato=(int) aux.getData();
        
        return dato;
    }
    

    
}