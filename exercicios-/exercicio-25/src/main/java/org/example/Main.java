package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        char desejaContinuar = 's';


        while (desejaContinuar == 's' || desejaContinuar == 'S') {

            System.out.println("Digite o primeiro número");
            numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número");
            numero2 = scanner.nextInt();

            if (numero1 == numero2) {
                System.out.println("os números digitados são iguais");
            } else {
                System.out.println("os números são diferentes.");
                if (numero1 > numero2) {
                    System.out.println("o número " + numero1 + " é o maior ");
                } else {
                    System.out.println("o número " + numero2 + " é o maior ");
                }
            }

            System.out.println("Deseja continuar ? s/n  sim ou não");
            desejaContinuar = scanner.next().charAt(0);

        }
    }
}