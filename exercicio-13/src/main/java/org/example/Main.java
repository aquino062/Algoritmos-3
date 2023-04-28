package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int verificadorDeNumero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número a verificar se é maior que 10");
        verificadorDeNumero = scanner.nextInt();

        if (verificadorDeNumero > 10) {

            System.out.println("Seu número é maior do que 10");

        } else if (verificadorDeNumero == 10) {
            System.out.println("Seu número é 10");

        } else {
            System.out.println("Seu número é menor que 10");
        }

    }
}