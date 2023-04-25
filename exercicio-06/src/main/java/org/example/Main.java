package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lsScanner = new Scanner(System.in);

        int a; //2
        int b; //5

        int temp; //1


        System.out.println("Digite o valor de A:");
        a = lsScanner.nextInt();
        System.out.println("Digite o valor de B:");
        b = lsScanner.nextInt();


        temp = a;

        a = b;
        b = temp;



        System.out.println("valores trocados a= "+ a + ", b= " + b);



    }
}