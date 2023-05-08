import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorConta = 0;

        System.out.println("Digite o tipo do cliente: \n 1- Residência \n 2- comércio \n 3- Indústria");
        int tipo = scanner.nextInt();

        System.out.println("Digite o consumo KW/h:");
        double consumo = scanner.nextDouble();


        switch (tipo) {
            case 1:
                valorConta = consumo * 0.60;
                break;
            case 2:
                valorConta = consumo * 0.48;
                break;
            case 3:
                valorConta = consumo * 1.29;
                break;
            default:
                System.out.println("opção inválida");

        }

        String valorFormatado = String.format("%.2f", valorConta);
        System.out.println(" valor total a pagar R$ " + valorFormatado);
        System.out.printf(" valor total a pagar R$ %.2f",valorConta);
    }
}