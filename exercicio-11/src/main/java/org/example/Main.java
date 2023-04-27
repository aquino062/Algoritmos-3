package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float precoCustoProduto = 0.0f;
        float taxaPercentual = 0.0f;
        float valorVenda = 0.0f;


        System.out.println("Digite a o preço de custo do produto");
        precoCustoProduto = scanner.nextFloat();


        System.out.println("Digite o percentual de acréscimo");
        taxaPercentual = scanner.nextFloat();

        valorVenda = ((precoCustoProduto * taxaPercentual) /100) + precoCustoProduto;

        System.out.println("o valor da venda foi de:"  + valorVenda);
    }
}