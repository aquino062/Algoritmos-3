package org.example;


public class pessoa {
     //atributos
    private float peso;
    private float altura;

    public pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;

    }
//metodos acessores
    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
