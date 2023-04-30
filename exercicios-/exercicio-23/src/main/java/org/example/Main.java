package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = scanner.nextInt();


        if (numero >= 80) {
            System.out.println("o número digitado é maior do que 80");
        } else if (numero == 40) {
            System.out.println("o número digitado é 40");
        } else if (numero <= 25) {
            System.out.println("o número digitado é menor que 25");
        }

    }
}