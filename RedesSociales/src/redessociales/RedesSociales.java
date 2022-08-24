/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redessociales;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cristal Ramos
 */
public class RedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Scanner leer = new Scanner(System.in);
        String direccion; 
       
        ManipularCSV archivo = new ManipularCSV();  // crear objeto
        
        System.out.print("Ingresa la direccion del archivo: ");
       
        direccion=leer.nextLine();
        
        

archivo.leerArchivo(direccion);        
   System.out.println("__________________________________________________");
  
   
   
    }
}
 

