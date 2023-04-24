package org.example;

import java.util.Date;

public class motorista  extends funcionario{

    private float periculosidade;


    public motorista(){
        super();

    }

    public float calcularSalarioMotorista(){
        return super.getSalario() + (this.periculosidade);
    }

    public float getPericulosidade() {
        return periculosidade;
    }

    public void setPericulosidade(float periculosidade) {
        this.periculosidade = periculosidade;
    }
}





