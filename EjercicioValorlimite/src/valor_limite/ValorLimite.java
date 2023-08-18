/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorlimite;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ValorLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ejercicio 10
       Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. */

        int valorLim,num,acum = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 20, será tu num limite");
         valorLim=leer.nextInt(); //este va a ser mi valor limite
         
         while (valorLim <0 || valorLim > 20) { //valido el num ingresado
               System.out.println("incorrecto, ingrese un num limite valido");
               valorLim=leer.nextInt(); 
        }
         
        System.out.println("tu número limite es:" + valorLim);
    
         while (acum<valorLim ){
            System.out.println("Ingrese un num");
             num=leer.nextInt();
          acum=num+acum;
             System.out.println("llevas "+ acum);
        }
         
    }
    
}
