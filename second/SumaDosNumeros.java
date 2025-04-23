package second;

/*
 * Crea un programa que pida al usuario dos números y los sume
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;        
        
        System.out.println("Por favor, ingresa un número");
        n1 = sc.nextDouble();

        System.out.println("Ahora ingresa otro número");
        n2 = sc.nextDouble();

        sc.close();

        System.out.println("El resultado de sumar " +n1+ " y " +n2+ " es: " + (n1+n2));
    }
}
