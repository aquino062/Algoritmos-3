package org.example;


import java.util.Date;

public class Main {
    public static void main(String[] args) {


        vendedor v = new vendedor();
        v.setNome("willian");
        v.setCpf("123344");
        v.setDataNascimento(new Date());
        v.setSalario(1000.0f);
        v.setTotalItensVendidos(10);
        v.setComissaoItem(10);


        System.out.println("vendedor:" + v.getNome());
        System.out.println("o salário do vendedor é de: R$ " + v.calcularSalario());


        motorista m = new motorista();
        m.setNome("joao");
        m.setCpf("123344");
        m.setDataNascimento(new Date());
        m.setSalario(1000.0f);
        m.setPericulosidade(500.0f);

        System.out.println("motorista:" + m.getNome());
        System.out.println("o salário do motorista é de: R$ " + m.calcularSalarioMotorista());


    }
}