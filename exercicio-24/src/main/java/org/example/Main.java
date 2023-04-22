package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner LsScanner = new Scanner(System.in);

        char desejaContinuar = 's';

        while (desejaContinuar == 's' || desejaContinuar == 'S') {


            System.out.println("digite um número:");
            int numero = LsScanner.nextInt();

            if (numero == 0) {
                System.out.println("o número é zero");
            } else {
                if (numero > 0) {
                    System.out.println("o número é maior que zero");
                } else {
                    System.out.println("o número é menor que zero");

                }
            }

            System.out.println("Deseja Continuar? S - Sim / N- Não");
            desejaContinuar = LsScanner.next().charAt(0);

        }
    }
}