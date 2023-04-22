package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner LScanner = new Scanner(System.in);

        int totalAlunos = 10;
        while (totalAlunos > 0) {

            System.out.println("digite seu nome :");
            String nomeAluno = LScanner.nextLine();

            System.out.println("digite sua idade:");
            int idadeAluno = LScanner.nextInt();

            System.out.println("o nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
        ;
    }
}