
package buscarletra;

import java.util.Scanner;


public class Buscarletra {

   
    public static void main(String[] args) {
        //Ejercicio 
        Scanner leer = new Scanner(System.in);
         String frase;
        System.out.println("Ingrese una frase que empiece con A");
        frase=leer.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("A"))  {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
