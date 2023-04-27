package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner lScanner = new Scanner(System.in);

        float temperaturaCelcius ;
        float temperaturaFahrenheit;


        System.out.println("Digite a temperatura em Celcius:");
        temperaturaCelcius = lScanner.nextFloat();

       temperaturaFahrenheit = (temperaturaCelcius * 9 + 160) / 5;

        System.out.println("a temperatura digitada em celsius é de: " + temperaturaCelcius + " C");
       System.out.println("a temperatura convertida em Fahrenheit é: " +temperaturaFahrenheit + " F" ) ;
    }
}