package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner LScanner = new Scanner(System.in);

        String nomeVendedor;
        float salarioFixo = 0.0f;
        float comissao = 0.15f;
        float totalVendas = 0.0f;
        float totalSalarioComissao = 0.0f;





        System.out.println("Digite o nome do vendedor:");
        nomeVendedor = LScanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        salarioFixo = LScanner.nextFloat();

        System.out.println("Digite o valor do total de vendas:");
        totalVendas = LScanner.nextInt();

        totalSalarioComissao = totalVendas * comissao + salarioFixo;

System.out.println("O Vendedor "+ nomeVendedor + " tem um salário fixo de R$: "+ salarioFixo +
        " seu sálario final foi de R$ " + totalSalarioComissao);

    }
}