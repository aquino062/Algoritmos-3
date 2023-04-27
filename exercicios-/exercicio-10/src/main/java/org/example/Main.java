package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valorProduto;
        int numeroParcelas;

        System.out.println("Digite o valor do produto:");
        valorProduto = scanner.nextFloat();


        do {
        System.out.println("Digite o número de parcelas. (até em 5x sem juros)");
        numeroParcelas = scanner.nextInt();

            if (numeroParcelas > 5) {

                System.out.println("você só pode parcelar até em 5x.");


            } else {

                System.out.println("o valor do produto ficou " + numeroParcelas + "x de " + (valorProduto / numeroParcelas));
            }
        }while(numeroParcelas > 5);






    }
}