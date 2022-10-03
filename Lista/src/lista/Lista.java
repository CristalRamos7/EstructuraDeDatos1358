/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import lista.doble.ligada.ListaDoble;

/**
 *
 * @author Cristal Ramos
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        ListaDoble ld = new ListaDoble();
        
        
        ld.agregarAlInicio(10);
        ld.agregarAlFinal(5);
        ld.agregarAlFinal(45);
        ld.agregarAlFinal(23);
        ld.agregarAlFinal(60);
        ld.transversal();
         System.out.println("--------1----------");
        ld.agregarDespuesDe(3, 6);
        ld.transversal();
         System.out.println("--------------------");
         ld.agregarAlInicio(12);         
         ld.transversal();
         System.out.println(ld.getTamanio());
         System.out.println("---------------------");
         ld.eliminar(5);
         ld.transversal();
         System.out.println("-----------------------");
         ld.eliminarElPrimero();
         ld.transversal();
         System.out.println("------------------------");
         ld.eliminarElFinal();
         
         ld.transversal();         
         System.out.println(ld.getTamanio());
         System.out.println("------------------------");
         System.out.println(ld.buscarValor(18));
         System.out.println("--------------------------");
         ld.modificarValor(10, 6);
         ld.transversal();
         System.out.println("--------------------------");
         ld.transversal("derecha");
    }



    }

