import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = 0.0;

        System.out.println("Digite o nome do professor");
        String nomeProfessor = scanner.next();

        System.out.println("Digite o nivel do professor: 1, 2 ou 3");
        int nivel = scanner.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        if(nivel == 1){
            salario = horasTrabalhadas * 12.00;
        }else if (nivel == 2){
            salario = horasTrabalhadas * 17.00;
        } else if (nivel == 3) {
            salario = horasTrabalhadas * 25.00;
        }else{
            System.out.println("nivel inválido, digite apenas de 1 até 3.");
        }

        String salarioFormatado = String.format("%.2f",salario);

        System.out.println("o salário do professor "+ nomeProfessor+ " foi de R$: "+ salarioFormatado);
    }
}