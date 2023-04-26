package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double quantidadeDolares;
        double cotacaoDolar;
        double totalConvertidoReais;

        System.out.println("Digite a quantidade em Dólar a converter ");
        quantidadeDolares = lScanner.nextDouble();


        System.out.println("Digite a cotação do Dólar ");
        cotacaoDolar = lScanner.nextDouble();


        totalConvertidoReais = quantidadeDolares * cotacaoDolar;

        System.out.println("Você tem um total de " + totalConvertidoReais + " R$");

    }
}