import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor do lado a:");
        a = scanner.nextInt();

        System.out.println("Digite o valor do lado b:");
        b = scanner.nextInt();

        System.out.println("Digite o valor do lado c:");
        c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("equilátero, todos os lados são iguais.");
            } else if (a == b || b == c || c == a) {
                System.out.println("isóscele, dois lados são iguais.");
            } else {
                System.out.println("Escaleno, todos os lados são diferentes.");
            }
        } else {
            System.out.println("Não foi possivel formar um triângulo");
        }

    }
}

