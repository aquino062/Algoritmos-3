import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorConta = 0;

        System.out.println("Digite qntd de horas consumidas");
        double horas = scanner.nextDouble();

        System.out.println("Digite o tipo do imovel: \n 1- Residência \n 2- comércio \n 3- Indústria");
        int tipo = scanner.nextInt();


        switch (tipo) {
            case 1:
                valorConta = horas * 0.60;
                break;
            case 2:
                valorConta = horas * 0.48;
                break;
            case 3:
                valorConta = horas * 1.29;
                break;
            default:
                System.out.println("opção inválida");

        }

        String valorFormatado = String.format("%.2f", valorConta);
        System.out.println("o valor total a pagar foi de R$ " + valorFormatado);
    }
}