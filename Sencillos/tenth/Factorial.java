package tenth;

/*
 * Crea un programa que pida al usuario un número entero.
 * El programa devolverá el factorial de ese número.
 * (Ej.: 5! = 5*4*3*2*1 = 120).
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero...");
        int num = sc.nextInt();
        sc.close();

        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + "! es = " + factorial);

    }
    
}
