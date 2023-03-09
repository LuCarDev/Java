   //Crear un programa que dado un numero determine si es par o impar.
package EjerciciosJava;

import java.util.Scanner;


public class EXERCISE6 {

   
    public static void main(String[] args) {
        int numero;
        double funcion;
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Hola , vamos a determinar si tu numero es par o impar.");
        System.out.println("Ingresa un numero cualquiera:");
        numero =leer.nextInt();
        
        funcion= numero%2;
        if (funcion==0) {
            System.out.println("El numero es par");
        }else{ 
            System.out.println("el numero es impar");
        }
        
    }
    
}