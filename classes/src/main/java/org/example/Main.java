package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lsScanner = new Scanner(System.in);


        pessoa objetopessoa = new pessoa(0f, 0f);


        System.out.println("Digite o peso da pessoa:");
        objetopessoa.setPeso(lsScanner.nextFloat());

        System.out.println("Digite a altura da pessoa:");
        objetopessoa.setAltura(lsScanner.nextFloat());



        System.out.println("imc = " + objetopessoa.calcularIMC());


    }
}
