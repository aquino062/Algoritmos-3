package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Digite o primeiro valor");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        valor2 = scanner.nextInt();

        if (valor1 > valor2 ){
            System.out.println("O MAIOR valor é o "+ valor1);
        } else if (valor1 == valor2) {

            System.out.println("os valores informados são iguais");
        }else{
            System.out.println("o valor MAIOR é o "+ valor2);
        }

    }
}