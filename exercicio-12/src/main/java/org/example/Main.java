package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float custoFinalCarro;
        float percentualDistribuidor = 28.0f;
        float custoFabrica;
        float percentualImposto = 45.0f;
        float custoFabricaImposto;


        System.out.println("Informe o custo de fábrica:");
        custoFabrica = scanner.nextFloat();

        // APLICAMOS A TAXA PERCENTUAL DO IMPOSTO 45%
        custoFabricaImposto = (((custoFabrica * percentualImposto) / 100) + custoFabrica);

        //APLICAMOS A TAXA DO DISTRIBUIDOR 28%
        custoFinalCarro = (((custoFabricaImposto * percentualDistribuidor) / 100) + (custoFabricaImposto));

        System.out.printf("O custo ao consumidor é : R$ %.2f " , custoFinalCarro);


    }
}