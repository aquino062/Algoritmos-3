package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nome;
        char sexo;

        int pessoasVerificar;

        int masculino = 0;
        int feminino = 0;


        System.out.println("Informe o Número de pessoas que deseja verificar:");
        pessoasVerificar = scanner.nextInt();



        for (int i = 1; i <= pessoasVerificar; i++) {
        System.out.println("Informe o nome da pessoa ");
        nome = scanner.next();

        System.out.println("Informe o sexo da pessoa: M/F (Masculino/Feminino)");
        sexo = scanner.next().charAt(0); //  charAt(0) lê apenas o primeiro digito.

            if (sexo == 'm' || sexo == 'M') {
                masculino++;
                System.out.println(nome + " Homem");
            } else if (sexo == 'f' || sexo == 'F') {
                System.out.println(nome + " Mulher");
                feminino++;

            }else{
                System.out.println("SEXO inválido, Digite apenas M P/ Masculino OU F p/ Feminino");
            }

        }

        System.out.println("o total de Homens foi de: "+ masculino);
        System.out.println("o total de Mulheres foi de: "+ feminino);

    }
}