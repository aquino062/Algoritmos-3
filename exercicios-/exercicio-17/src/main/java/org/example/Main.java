package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int contador = 0;
        int qntdNumerosVerificar;


        System.out.println("Insira a quantidade de Números que deseja verificar:");
        qntdNumerosVerificar = scanner.nextInt();

        for (int i = 1; i <= qntdNumerosVerificar; i++) {

            System.out.println("Digite o " + i + "º numero");
            numeroDigitado = scanner.nextInt();


            if (numeroDigitado >= 10 && numeroDigitado <= 150) {
                contador++;
            }
        }
        System.out.println("estão no intervalo de (10 a 150) um total de " + contador + " Números.");
    }
}