/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer= new Scanner (System.in);
        System.out.println("Califique la pelicula de 1 a 5 Estrellas");
        byte opinion;
        opinion =leer.nextByte();
      if (opinion >=1 && opinion <=5){
switch (opinion){
             case 1:
             case 2:
            System.out.println("Que mal que no te haya gustado :( ");
            break;
        case 3:
            System.out.println("Has calificado esta peli como Buena");
            break;
             case 4:
            System.out.println("Has calificado esta peli como Muy Buena ");
            break;
             case 5:
            System.out.println("Has calificado esta peli como Excelente ");
            break;
}
      }    if (opinion >=1){
          if (opinion <=5){
              System.out.println("Bue cheto mal");
              
          }
                    }
      else {
          System.out.println("Bue re malarda la peliculera");
        }
    }
}

  
