package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        String c;
        double result = 0;


        System.out.println("Digite o valor de a ");
        a = scanner.nextDouble();

        System.out.println("Digite o valor de b");
        b = scanner.nextDouble();

        System.out.println("Digite o simbolo da operação aritmetica: x + - / ");
        c = scanner.next();


        if (c.equals("+")) {
            result = a + b;
        } else if (c.equals("-")) {
            result = a - b;
        } else if (c.equals("x") || c.equals("X")) {
            result = a * b;
        } else if (c.equals("/")) {
            if ( b == 0) {
                System.out.println("não é possivel dividir por zero");
            } else {
                result = a / b;

            }
        } else {
            System.out.println("operação inválida!");
        }

        System.out.println( "resultado: "+ result);
    }
}