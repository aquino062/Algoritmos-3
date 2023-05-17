package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira nota:");
        double nota01 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota02 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota03 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03) / 3;

        System.out.printf("A média do aluno foi de %.2f \n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}