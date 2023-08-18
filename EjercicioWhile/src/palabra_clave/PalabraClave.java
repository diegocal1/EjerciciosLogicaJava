/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalabraClave;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class PalabraClave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 7
   /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        while (!"Eureka".equalsIgnoreCase(frase)) {            
            System.out.println("No es correcto");
             System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        }
        System.out.println("Es correcto, saliste del bucle");
 
    }
    
}
