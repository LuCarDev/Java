/* 
*Escribir un programa que pida dos números enteros por teclado
*y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma*/
package EjerciciosJava;

import java.util.Scanner;


public class EXERCISE1 {

   
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Scanner respuesta= new Scanner (System.in);
       String siONo;
        int numero1;
        int numero2;
        int suma;
        System.out.println("Vamos a realizar una suma sencilla");
        System.out.println("Ingrese el primer numero");
        numero1= numeros.nextInt();
        System.out.println("Ahora ingrese el segundo numero");
        numero2=numeros.nextInt();
        suma=numero1+numero2;
        System.out.println("La suma de "+numero1+" y de "+numero2+" es de "+suma);
        System.out.println("Quiere realizar otra suma? (S/N)");
       siONo=respuesta.next();
     while (siONo.equalsIgnoreCase("S")){
         System.out.println("Ingrese el primer numero");
         numero1 = numeros.nextInt();
         System.out.println("Ahora ingrese el segundo numero");
         numero2 = numeros.nextInt();
         suma = numero1 + numero2;
         System.out.println("La suma de " + numero1 + " y de " + numero2 + " es de " + suma);
         System.out.println("Quiere realizar otra suma? (S/N)");
          siONo=respuesta.next();
     }
        System.out.println("Gracias vuelva prontos");
    }
    
}
