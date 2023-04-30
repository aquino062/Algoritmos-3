package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número de 1 a 5 para ler em extenso.");
        numero = scanner.nextInt();

        switch(numero) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            default:
                System.out.println("número inválido, digite apenas de 1 a 5.");
        }
    }
}