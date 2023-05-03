import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;


        System.out.println("Digite o primeiro valor");
        valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor");
        valor3 = scanner.nextInt();


        //valor 1 menor
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.print(valor1 + "\n");
            if (valor2 < valor3) {
                System.out.print(valor2 + "\n" + valor3);
            } else {
                System.out.print(valor3 + " \n" + valor2);
            }//valor 2 menor
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.print(valor2 + "\n");
            if (valor1 < valor3) {
                System.out.print(valor1 + "\n" + valor3);
            } else {
                System.out.print(valor3 + "\n" + valor1);
            }
        } else { //valor 3 menor
            System.out.println(valor3 + "\n");
            if (valor1 < valor2) {
                System.out.print(valor1 + "\n" + valor2);
            } else {
                System.out.print(valor2 + "\n" + valor1);
            }
        }
    }
}