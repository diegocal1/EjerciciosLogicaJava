
package gradosfarenheit;

import java.util.Scanner;


public class Gradosfarenheit {

   
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados

Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

        Scanner leer = new Scanner(System.in);


  System.out.println("Vamos a convertir °C a °FH");

  System.out.println("Ingrese los °C");

        int cent = leer.nextInt();

        int faren = 32 + (9 *cent/5);

    System.out.println("Son " + faren + " grados farenheit");

    }
    
}
