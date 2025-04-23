package third;

/*
 * Crea un programa que pida al usuario un número 
 * y diga si el número es par o impar
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un número...");
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0){
            System.out.println("El número que has introducido es par");
        } else {
            System.out.println("El número que has introducido es impar.");
        }

    }
}
