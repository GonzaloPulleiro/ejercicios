package seventh;

/*
 * Crea un programa que pida al usuario una palabra 
 * y devuelva esa palabra invertida.
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra...");

        String word = sc.nextLine();
        sc.close();

        word = word.toLowerCase();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println("Tu palabra al revés es: " + reverse);

    }
}
