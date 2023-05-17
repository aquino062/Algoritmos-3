package org.example;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dimensao = obterDimensoesObjeto();
        double peso = obterPesoObjeto();
        double rota = obterRotaObjeto();

        double total = dimensao * peso * rota;


        System.out.printf("total a pagar é R$ %.2f (dimensões: %d * peso: %.2f * rota: %.2f)", total, dimensao, peso, rota);


    }

    public static int obterDimensoesObjeto() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.print("Digite o comprimento do objeto (em cm): ");
                double comprimento = scanner.nextDouble();

                System.out.print("Digite a largura do objeto (em cm): ");
                double largura = scanner.nextDouble();

                System.out.print("Digite a altura do objeto (em cm): ");
                double altura = scanner.nextDouble();

                double volume = altura * largura * comprimento;
                System.out.printf("O volume do objeto é (em cm³) %.2f%n", volume);

                if (volume < 1000) {
                    return 10;
                } else if (volume >= 1000 && volume < 10000) {
                    return 20;
                } else if (volume >= 10000 && volume < 30000) {
                    return 30;
                } else if (volume >= 30000 && volume < 100000) {
                    return 50;
                } else {
                    System.out.println("Não são aceitos objetos tão grandes. Por favor, digite as dimensões novamente.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Você digitou uma dimensão não numérica. Por favor, digite as dimensões novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }

        }

    }

    public static double obterPesoObjeto() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite o peso do objeto (em kg): ");
                double peso = scanner.nextDouble();

                if (peso <= 0.1) {
                    return 1;
                } else if (peso >= 0.1 && peso < 1) {
                    return 1.5;
                } else if (peso >= 1 && peso < 10) {
                    return 2;
                } else if (peso >= 10 && peso < 30) {
                    return 3;
                } else {
                    System.out.println("Não é aceito peso acima do limite máximo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Você digitou um peso não numérico. Por favor, digite o peso novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    public static double obterRotaObjeto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a rota:\n"
                + "RS - De Rio de Janeiro até São Paulo\n"
                + "SR - De São Paulo até Rio de Janeiro\n"
                + "BS - De Brasília até São Paulo\n"
                + "SB - De São Paulo até Brasília\n"
                + "BR - De Brasília até Rio de Janeiro\n"
                + "RB - Rio de Janeiro até Brasília\n");
        while (true) {


            System.out.println("Digite a rota do objeto:");
            String rota = scanner.next().toUpperCase();

            if (rota.equals("RS") || rota.equals("SR")) {
                return 1;

            } else if (rota.equals("BS") || rota.equals("SB")) {
                return 1.2;

            } else if (rota.equals("BR") || rota.equals("RB")) {
                return 1.5;

            } else {
                System.out.println("Rota inválida");
            }
        }

    }

}




