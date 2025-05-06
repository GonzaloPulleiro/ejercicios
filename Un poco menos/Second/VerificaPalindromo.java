

/*
 * Solicita al usuario una palabra o frase
 * Determina si la entrada es un palíndromo (igual al revés)
 * 
 * @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class VerificaPalindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce una palabra o una frase...");

        String entrada = sc.nextLine();
        sc.close();

        entrada = entrada.toLowerCase().replaceAll("[^a-z0-9]", "");

        String salida = new StringBuilder(entrada).reverse().toString();

        System.out.println("Introducido: " + entrada + ". Obtenido: "+salida);

        if(entrada.equals(salida)){
            System.out.println("Palíndromo");
        }
        else {
            System.out.println("NO Palíndromo");
        }

    }
    
}
