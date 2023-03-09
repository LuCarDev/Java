/*
*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
*pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
*la función equals() en Java.*/
package EjerciciosJava;

import java.util.Scanner;


public class EXERCISE7 {

  
    public static void main(String[] args) {
String frase;
Scanner leer= new Scanner (System.in);
        System.out.println("ingrese una palabra , de preferencia 'eureka' ");
        frase=leer.next();
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        }

    }