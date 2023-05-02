import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMes;

        System.out.println("Digite o número do mês");
        numeroMes = scanner.nextInt();


        switch (numeroMes) {
            case 1 -> System.out.println("janeiro");
            case 2 -> System.out.println("fevereiro");
            case 3 -> System.out.println("março");
            case 4 -> System.out.println("abril");
            case 5 -> System.out.println("maio");
            case 6 -> System.out.println("junho");
            case 7 -> System.out.println("julho");
            case 8 -> System.out.println("agosto");
            case 9 -> System.out.println("setembro");
            case 10 -> System.out.println("outubro");
            case 11 -> System.out.println("novembro");
            case 12 -> System.out.println("dezembro");

            default -> System.out.println("inválido");
        }
    }
}