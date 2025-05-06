package fourth;

/*
 * Crea un programa que pida al usuario 3 números
 * y devuelva el mayor de los 3
 * 
 *  @author: Gonzalo Pulleiro
 */

 import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduce 3 números");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        sc.close();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " es el número mayor.");
        } else if(n1 < n2 && n2 > n3){
            System.out.println(n2 + " es el número mayor.");
        } else {
            System.out.println(n3 + " es el número mayor.");
        }
    }
}
