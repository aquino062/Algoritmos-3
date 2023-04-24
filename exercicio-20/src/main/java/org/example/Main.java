package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lscScanner = new Scanner(System.in);

        float valorCarro = 0.0f;
        int anoFabricacao = 0;
        float porcentagemDesconto = 0.0f;
        float valorPagar = 0.0f;
        float valorDesconto = 0.0f;

        int totalCarrosSeminovos = 0;
        int totalCarrosGeral = 0;

        char desejaRepetir = 's';


        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.println("Digite o ano de fabricaçao do veiculo:");
            anoFabricacao = lscScanner.nextInt();

            System.out.println("Digite o valor do veiculo:");
            valorCarro = lscScanner.nextFloat();


            if (anoFabricacao <= 2000) {
                // 12% de desconto
                porcentagemDesconto =  0.12f;
            } else {
                //7% de desconto
                porcentagemDesconto = 0.07f;

                totalCarrosSeminovos++;
            }
            totalCarrosGeral++;

            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;

            System.out.println(" o valor de desconto foi de: "+ valorDesconto);
            System.out.println("o valor a pagar é de :" + valorPagar);


            System.out.println("Deseja fazer mais cadastros ? S- SIM / N- NÃO");
            desejaRepetir = lscScanner.next().charAt(0);
        }

        System.out.println(" o total de carros cadastrados é: " + totalCarrosGeral);
        System.out.println(" o total de carros seminovos é: " + totalCarrosSeminovos);


    }
}