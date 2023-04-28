package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        char estaBemDeSaude;
        int totalAnalizar;
        int totalHomemsAptos = 0;
        int totalMulheresAptas = 0;
        int naoApto = 0;

        System.out.println("Digite quantas pessoas deseja analisar");
        totalAnalizar = scanner.nextInt();

        for (int i = 1; i <= totalAnalizar; i++) {

            System.out.println("nome:");
            nome = scanner.next();

            System.out.println("sexo:  (Masculino/Feminino)");
            sexo = scanner.next().charAt(0);

            System.out.println("idade:");
            idade = scanner.nextInt();

            System.out.println("Saúde está boa?  sim/não");
            estaBemDeSaude = scanner.next().toUpperCase().charAt(0);

            if (idade >= 18 && estaBemDeSaude == 'S') {
                if (sexo == 'M' || sexo == 'm') {
                    System.out.println("nome:" + nome + "\n" + idade + " anos" + "\n" + "sexo: Masculino \n" + "está apto");
                    totalHomemsAptos++;

                } else if (sexo == 'f' || sexo == 'F') {
                    System.out.println("nome:" + nome + "\n" + idade + " anos" + "\n" + "sexo: Feminino \n" + "está apto");
                    totalMulheresAptas++;
                } else {
                    System.out.println("sexo inválido");
                }

            } else {
                System.out.println("Não está apto");
                naoApto++;
            }
        }
        System.out.println("Total de Homems Aptos foi de :" + totalHomemsAptos);
        System.out.println("Total de Mulheres Aptos foi de: " + totalMulheresAptas);
        System.out.println("Total de Pessoas Não Aptos foi de: " + naoApto);

    }
}