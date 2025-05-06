package Sencillos.eighth;

/*
 * Crea un programa que pida al usuario una frase.
 * El programa contará el total de vocales en la frase
 * y lo devolverá al usuario. También devolverá la 
 * cantidad de veces que aparece cada vocal en la frase.
 * 
 *  @author: Gonzalo Pulleiro
 */
import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase...");

        String frase = sc.nextLine();
        sc.close();

        int a = 0, e = 0, i = 0, o = 0, u = 0, contador = 0;

        for (int j = 0; j < frase.length(); j++) {
            char c = frase.charAt(j);
            
            switch (c) {
                case 'a':
                    a++;
                    contador++;
                    break;
                case 'e':
                    e++;
                    contador++;
                    break;
                case 'i':
                    i++;
                    contador++;
                    break;
                case 'o':
                    o++;
                    contador++;
                    break;
                case 'u':
                    u++;
                    contador++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El total de vocales en la frase es de: " + contador);
        System.out.println("Distribuídas en las siguientes cantidades: ");
        System.out.println("A = " + a + "\tE = " + e + "\tI = " +i + "\tO = " + o + "\tU = " + u);
    }
}
