package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner lScanner = new Scanner(System.in);

        int i = 0;
        for (; i < 3; i++) {

            System.out.println("Digite o nome do produto:");
            nomeProduto = lScanner.next();

            System.out.println("Digite o preço de custo do produto:");
            precoCusto = lScanner.nextFloat();

            System.out.println("Digite o preço de venda do produto:");
            precoVenda = lScanner.nextFloat();


            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;


            if (precoCusto == precoVenda) {
                System.out.println("houve um empate entre preço de custo e preço de venda.");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("houve um prejuizo.");
                } else {
                    System.out.println("houve lucro.");
                }
            }
            System.out.println(nomeProduto + " , preço de custo = " + precoCusto + " , preço de venda = " + precoVenda);

            float lucroPorcentagem = ((precoVenda - precoCusto) / precoCusto) * 100;
            // formula para calcular a porcentagem de lucro

            System.out.println("Porcentagem de lucro de " + nomeProduto + ": " + lucroPorcentagem + "%");

        }

        float mediaTotalCusto = totalCusto / i;
        float mediaTotalVenda = totalVenda / i;

        System.out.println("a média do preço de custo é de: " + mediaTotalCusto);
        System.out.println("a média do preço de venda é de: " + mediaTotalVenda);
        System.out.println("a margem de lucro foi de: " + ((mediaTotalVenda - mediaTotalCusto) / mediaTotalCusto * 100)
                + "%");

    }
}