package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lsScanner = new Scanner(System.in);


        String nomeAluno;
        float nota01 = 0.0f;
        float nota02 = 0.0f;
        float nota03 = 0.0f;



        System.out.println("informe o nome do aluno: ");
        nomeAluno = lsScanner.nextLine();

        System.out.println("informe a primeira nota:");
        nota01 = lsScanner.nextFloat();
        System.out.println("informe a segunda nota:");
        nota02 = lsScanner.nextFloat();
        System.out.println("informe a terceira nota:");
        nota03 = lsScanner.nextFloat();

        float media = (nota01 + nota02 + nota03) / 3;

        System.out.println("o aluno " + nomeAluno + " teve uma média final de: " + media);

    }
}