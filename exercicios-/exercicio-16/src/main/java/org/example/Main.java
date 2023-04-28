package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        float nota1;
        float nota2;
        float nota3;


        System.out.println("Digite o nome do aluno");
        nomeAluno = scanner.nextLine();

        System.out.println("Digite a Primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a Segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextFloat();

        float media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 7) {
            System.out.println("Parábens " + nomeAluno + " Você foi Aprovado ");
            System.out.println("Sua nota foi de "+ media);

        } else if (media >= 5.1f && media <= 6.9f) {
            System.out.println( nomeAluno + " Você está de Recuperação");
            System.out.println("Sua nota foi de "+ media);
        }else{
            System.out.println( nomeAluno+ " Você foi Reprovado");
            System.out.println("Sua nota foi de "+ media);
        }
    }

}