package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero;

     Scanner LeitorScanner = new Scanner(System.in);

     System.out.println("Digite um valor:");
     numero = LeitorScanner.nextInt();

     if(numero >=100 && numero <= 200){
         System.out.println("o número está no intervalo");

     }else{
         System.out.println("o número não está no intervalo");
     }
    }
}