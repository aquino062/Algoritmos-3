package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

Scanner lScanner = new Scanner(System.in);

float numero1 = 0.0f;
float numero2 = 0.0f;
float soma = 0.0f;




System.out.println("Digite o primeiro Número:");
numero1 = lScanner.nextFloat();


System.out.println("Digite o segundo Número:");
numero2 = lScanner.nextFloat();

soma = numero1 + numero2;

System.out.println("A Soma entre os dois números é de : "+ soma);

    }
}