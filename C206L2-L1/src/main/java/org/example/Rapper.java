package org.example;

public class Rapper {

    //classe parte por composição
    //Atributos
    String nome;
    float nota;
    int idade;

    Microfone microfone;

    //Métodos

    //Construtor
    public Rapper(String nome, float nota, int idade, String material){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.microfone = new Microfone(material);
    }
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Microfone: "+this.microfone.material);
        System.out.println("Nota: "+this.nota);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }
}
