//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre pòr la pantalla
package EjerciciosJava;

import java.util.Scanner;


public class EXCERCISE2 {

    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
String nombre;
        System.out.println("Hola! Por favor ingrese su nombre: ");
        nombre= leer.next();
        System.out.println("Hola "+nombre+",Bienvenido!");
    }
    
}
