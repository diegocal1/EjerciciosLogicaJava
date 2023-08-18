
package bienvenidausuario;

import java.util.Scanner;


public class BienvenidaUsuario {

   
    public static void main(String[] args) {
       /*[EJERCICIO  2 de APRENDIZAJE]
      Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
        Scanner leer = new Scanner(System.in);    
    String nombre;
        
        System.out.println("Hola! por favor ingresa tu nombre");
        nombre=leer.nextLine();
        System.out.println("Bienvenid@ " + nombre );
        
    }
    
}
