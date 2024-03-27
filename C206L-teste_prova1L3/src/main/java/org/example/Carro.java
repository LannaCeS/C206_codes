package org.example;

public class Carro {
    //classe parte
    String modelo;
    String cor;
    boolean alugado;

    //classe para composição
    Motor motor;

    public Carro(String modelo, String cor, boolean alugado, float velMax){
        this.motor = new Motor(velMax);
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
    }

    public void mostraInfo(){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Alugado: "+this.alugado);
        System.out.println("Velocidade máxima: "+this.motor.velocidadeMaxima);
    }

}
