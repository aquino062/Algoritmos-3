import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeFuncionario;
        double salarioFuncionario = 0;
        double salarioMinimo;
        double aumento = 0;
        double salarioReajustado = 0;

        int numeroDeFuncionarios = 3;
        double novaFolha = 0;
        double totalAumento = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do sálario minimo:");
        salarioMinimo = scanner.nextDouble();

        for (int i = 1; i <= numeroDeFuncionarios; i++) {


            System.out.println("Digite o nome do funcionário");
            nomeFuncionario = scanner.next();


            System.out.println("Digite o salário do funcionário");
            salarioFuncionario = scanner.nextDouble();


            if (salarioFuncionario <= salarioMinimo * 3) {
                aumento = salarioFuncionario * 0.5;
                salarioReajustado = salarioFuncionario + aumento;

            } else if (salarioFuncionario <= salarioMinimo * 10) {
                aumento = salarioFuncionario * 20 / 100;
                salarioReajustado = salarioFuncionario + aumento;

            } else if (salarioFuncionario <= salarioMinimo * 20) {
                aumento = salarioFuncionario * 15 / 100;
                salarioReajustado = salarioFuncionario + aumento;

            } else {
                aumento = salarioFuncionario * 10 / 100;
                salarioReajustado = salarioFuncionario + aumento;
            }


            double valorPorcentagem = ((aumento / salarioFuncionario) * 100);

            System.out.println(nomeFuncionario + " seu salário é de R$" + salarioFuncionario);
            System.out.println("salário reajustado em " + valorPorcentagem + "%");
            System.out.println("Seu novo salário é de R$:" + salarioReajustado);


            totalAumento += aumento;
            novaFolha += salarioReajustado;
        }

        System.out.println("total de aumento foi : " + totalAumento);
        System.out.println("Nova folha de pagamento: " + novaFolha);

    }

}