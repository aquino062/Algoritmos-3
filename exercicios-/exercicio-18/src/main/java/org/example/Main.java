package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoasVerificar;
        int pessoasMaiorIdadee = 0;
        int pessoaMenorIdade = 0;
        int pessoa;


        System.out.println("Digite a Quantidade de Pessoas que Deseja Verificar");
        totalPessoasVerificar = scanner.nextInt();


        for (int i = 1; i <= totalPessoasVerificar; i++) {
            System.out.println("Digite a idade da " + i + "º pessoa");
            pessoa = scanner.nextInt();


            if (pessoa >= 18) {
                pessoasMaiorIdadee++;
                System.out.println("A pessoa de Nº" + i + " é Maior de idade");
            } else if (pessoa == 0) {
                System.out.println("Idade inválida");

            } else {
                System.out.println("A pessoa de Nº" + i + " é Menor de idade");
            }
        }
    }
}