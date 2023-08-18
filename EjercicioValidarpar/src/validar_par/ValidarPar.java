/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidarPar;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ValidarPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Ejercicio 6

//Crear un programa que dado un numero determine si es par o impar.

 

Scanner leer=new Scanner(System.in);

int num;

System.out.println("Ingrese un número para verificar si es par o impar");

num=leer.nextInt();

if(num%2==0){

   

    System.out.println("Número es par");

}else{

    System.out.println("Número es impar");

  }
          
    }
    
}
