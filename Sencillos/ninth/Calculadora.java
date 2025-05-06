package ninth;

/*
 * Crea un programa que pida al usuario dos números y el signo operacional.
 * El programa devolverá la operación solicitada por el usuario.
 * 
 *  @author: Gonzalo Pulleiro
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el otro número: ");
        double num2 = sc.nextDouble();

        System.out.println("Introduce uno de los siguientes signos: + - / * ");
        char operador = sc.next().charAt(0);

        sc.close();

        double resultado = 0;
        String operacion = "";

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                operacion = "sumar";
                break;
            case '-':
                resultado = num1 - num2;
                operacion = "restar";
                break;
            case '*':
                resultado = num1 * num2;
                operacion = "multiplicar";
                break;
            case '/':
            if(num2 != 0){
                resultado = num1 / num2;
                operacion = "dividir";
            } else {
                System.err.println("No se puede dividir por cero.");
            }
                break;
            default:
                System.out.println("El signo no se corresponde a los facilitados.");
                break;
        }

        System.out.println("El resultado de " + operacion + " " + num1 + " y " + num2 + " es = " + resultado);

    }
}
