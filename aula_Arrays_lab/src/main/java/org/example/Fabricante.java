package org.example;

public class Fabricante {
    //variables
    String nome;
    int cnpj;
    Produto produto;

    public Fabricante(String nome, int cnpj){
        this.nome = nome;
        this.cnpj = cnpj;

    }

    public void mostraInfo(){
        System.out.println("Nome do fabricante: "+ this.nome);
        System.out.println("CNPJ do fabricante: "+ this.cnpj);
    }
}
