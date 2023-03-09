/*
*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
*en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package EjerciciosJava;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class EXERCISE3 {

 
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      String frase;
        System.out.println("Ingrese una breve frase");
        frase=leer.nextLine();
        System.out.println("Ahora veamos tu frase escrita en MAYUSCULAS:");
        System.out.println(toUpperCase(frase));
        System.out.println("NO GRITES! AHORA VEAMOSLO EN  minusculas");
        System.out.println(toLowerCase(frase));
        System.out.println("Viste que hablando bien la gente se entiende? jaja salu2");
        
    }
    
}
