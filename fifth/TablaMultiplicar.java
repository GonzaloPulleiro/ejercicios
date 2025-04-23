package fifth;

/*
 * Crea un programa que pida al usuario un número
 * y devuelva la tabla de multiplicar hasta 10 ese número
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = sc.nextInt();
        sc.close();

        System.out.println("*** Tabla de multiplicar del " + num + " ***");

        for (int i = 1; i < 11; i++) {
            System.out.println("- " + num + " * " + i + " = " + (num * i));
        }
        System.out.println("***************");

    }
}
