package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lScanner = new Scanner(System.in);

        float distanciaPercorrido;
        float totalCombustivel;
        float calculo;

        System.out.println("Digite a distancia total percorrido:");
        distanciaPercorrido = lScanner.nextFloat();

        System.out.println("Digite o total de combustivel gasto:");
        totalCombustivel = lScanner.nextFloat();

        calculo = distanciaPercorrido / totalCombustivel;


System.out.println("O consumo médio do automóvel é de: " + calculo + " km por litros.");
    }
}