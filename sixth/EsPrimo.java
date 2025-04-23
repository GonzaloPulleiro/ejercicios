package sixth;

/*
 * Crea un programa que pida al usuario un número
 * e indique al usuario si es primo o no.
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número...");
        int num = sc.nextInt();
        sc.close();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }
}
