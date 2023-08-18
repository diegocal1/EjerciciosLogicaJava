
package ejercicio3aprendizaje;

import java.util.Scanner;


public class Ejercicio3Aprendizaje {


    public static void main(String[] args) {
         /*[EJERCICIO 3 DE APRENDIZAJE]
        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java. */
        Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese una frase");
         String frase=leer.nextLine();
         
         System.out.print("Asi queda tu frase en minuscula  ");
         System.out.println(frase.toLowerCase());
         
         System.out.print("Asi queda tu frase en mayuscula ");
         System.out.println(frase.toUpperCase());
    }
    
}
