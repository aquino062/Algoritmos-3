package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
       float valorDeposito;
        float taxaJuros = 0.07f;


        System.out.println("Digite o valor a ser depositado");
        valorDeposito = lScanner.nextFloat();

       float rendimentoMensal = (taxaJuros * valorDeposito) / 100;

        System.out.println("valor depósitado: " + valorDeposito + " R$");
        System.out.println("Rendimento mensal: " + rendimentoMensal + " R$");
        System.out.println("valor disponivel após 1 mês: " + (valorDeposito + rendimentoMensal) + " R$");
    }
}