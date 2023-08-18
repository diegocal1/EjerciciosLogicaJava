package buscarOchoLetras;

import java.util.Scanner;


public class BuscarFrase8letras {

    
    public static void main(String[] args) {
          /*Ejercicio 8
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
        
         Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase de 8 letras");
        frase=leer.nextLine();
       int i=8;
        if(frase.length()!=8){ //negación 
            System.out.println("Incorrecto");
        }else{
            System.out.println("Correcto");
        }
     
    }//fin main
    
}//fin class
