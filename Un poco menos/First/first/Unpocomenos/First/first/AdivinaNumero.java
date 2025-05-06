
/*
 * Genera un número aleatorio entre 1 y 100
 * el usuario debe adivinar el número
 * por cada intento el programa debe informar si el número
 * es demasiado bajo, demasiado alto o es correcto
 * 
 * El juego termina cuando el usuario acierta y muestra el total de intentos
 * 
 * @author: Gonzalo Pulleiro
 */

 import java.util.Scanner;

 public class AdivinaNumero {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         int adivina = (int) (Math.random() * 100 + 1);
         int intentos = 1;
 
         System.out.println("Número aleatorio : " + adivina);
 
         System.out.println("Por favor, ingresa un número entre 1 y 100...");
 
         int numero = sc.nextInt();
 
         while (numero <= 0 || numero >= 100) {
             System.out.println("El número introducido no es válido");
             System.out.println("Por favor, ingresa un número entre 1 y 100...");
             numero = sc.nextInt();
         }
 
         while (numero != adivina) {
             if (numero < adivina) {
                 System.out.println("El número introducido es menor al número buscado");
                 System.out.println("Por favor, ingresa un número...");
 
             } else {
                 System.out.println("El número introducido es mayor al número buscado");
                 System.out.println("Por favor, ingresa un número...");
             }
             numero = sc.nextInt();
 
             while (numero <= 0 || numero >= 100) {
                 System.out.println("El número introducido no es válido");
                 System.out.println("Por favor, ingresa un número entre 1 y 100...");
                 numero = sc.nextInt();
             }
 
             intentos++;
         }
         System.out.println("Enhorabuena, has acertado el número aleatorio");
         System.out.println("Total de intentos: " + intentos);
 
         sc.close();
     }
 }
 