package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeNadador;
        System.out.println("Digite a idade do nadador:");
        idadeNadador = scanner.nextInt();

        if (idadeNadador >= 5 && idadeNadador <= 7) {
            System.out.println(" Sua categoria é Infantil A");
        }
        else if (idadeNadador >= 8 && idadeNadador <= 10) {
            System.out.println(" Sua categoria é Infantil B");
        }
        else if (idadeNadador >= 11 && idadeNadador <= 13) {
            System.out.println(" Sua categoria é Juvenil A");
        }
        else if (idadeNadador >= 14 && idadeNadador <= 17) {
            System.out.println(" Sua categoria é Juvenil B");
        }
        else if (idadeNadador >= 18 && idadeNadador <= 25) {
            System.out.println(" Sua categoria é Sênior");
        }
        else {
            System.out.println("idade fora da faixa etária");
        }


    }
}