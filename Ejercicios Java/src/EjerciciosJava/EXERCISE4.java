/*
*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
*Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package EjerciciosJava;

import java.util.Scanner;


public class EXERCISE4 {


    public static void main(String[] args) {
double fahrenheit;
double celsius;
Scanner leer = new Scanner (System.in);

        System.out.println("Hola! ingrese los ºC para convertirlos en ºF");
        celsius=leer.nextDouble();
        fahrenheit= (32+(9*celsius/5));
        System.out.println("Los grados Celcius que ingresaste , son "+fahrenheit+"ºF");
    }
    
}
