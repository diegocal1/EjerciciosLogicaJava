

package MetodoMath;

import java.util.Scanner;


public class MetodoMat {

  
    public static void main(String[] args) {
        
            /*Ejercicio 5

Escribir un programa que lea un número entero por teclado y muestre por pantalla el

doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función

Math.sqrt().*/
    
    
         Scanner leer=new Scanner(System.in);

  int num,doble,triple;

  double raiz;

  System.out.println("Ingrese un num");

  num=leer.nextInt();

 

  doble =num*2;

  triple =num*3;

  raiz = MetodoMat.sqrt(num); //metodo para sacar raíz cuadrada

 

  System.out.println("El doble del número ingresado fue "+ doble);

   System.out.println("El triple del número ingresado fue "+ triple);

   System.out.println("La raiz cuadrada del número ingresado fue "+ raiz);


    }

    private static double sqrt(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
