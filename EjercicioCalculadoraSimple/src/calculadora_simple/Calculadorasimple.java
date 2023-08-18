
package calculadorasimple;

import java.util.Scanner;


public class Calculadorasimple {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          int num,num1;
     
      System.out.println("Ingrese un primer número");
      num=leer.nextInt();
     
      System.out.println("Ingrese un segundo número");
       num1=leer.nextInt();
       
 
        do {         
            int opcion;
       
              System.out.println("Elija una operacion");
       System.out.println("1- Sumar  2-Restar 3-Multiplicar 4-Dividir, 5-Salir");
       opcion=leer.nextInt();
                 switch(opcion) {
        case 1:
         int resultadoSuma= sumar(num,num1);
       System.out.println("El resultado de la suma es " + resultadoSuma);
        break;
       
        case 2:
        int resultadoResta= restar(num,num1);
         System.out.println("El resultado de la resta es " + resultadoResta);
        break;
       
        case 3:
         int resultadoMulti= multiplicar(num,num1);
         System.out.println("El resultado de la multiplicacion " + resultadoMulti);
         break;
         
          case 4:
         float resultadoDivision= dividir(num,num1);
       System.out.println("El resultado de la division es " + resultadoDivision);
}
        
        } while (true);
    }
    //aqui voy a desarrollar las funciones
public static int sumar (int a,int b){ //static para indicar que ese atributo o metodo no pertenece a la las instancias de la clase, sino a la clase en si
    int suma = a + b; //tipo de operacion y mi tipo de valor 
    return suma; //variable de retorno
}
public static int multiplicar (int a,int b){
    int multiplicacion = a * b;
    return multiplicacion; //variable de retorno
}
public static int restar (int a,int b){
    int resta = a - b;
    return resta; //variable de retorno
}
public static float  dividir(float a,float b){ //el tipo de retorno debe ser igual en la variable a guardar
    float division = a / b;     
    return division; //variable de retorno
}
public static float resto (int a,int b){
    int modulo = a % b;
    return modulo;  //variable de retorno
}
}
