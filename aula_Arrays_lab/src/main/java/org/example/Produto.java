package org.example;

public class Produto {
    String nome;
    int nota;
    Fabricante fabricante;
    int quantidade;

    public Produto(String nome, int nota, int quantidade, String name, int cnpj){
        this.nome = nome;
        this.nota = nota;
        this.quantidade = quantidade;
        this.fabricante = new Fabricante(name, cnpj);

    }
    public void mostraInfo(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Nota do produto: " + this.nota);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.println("Nome do fabricante: " + this.fabricante.nome);
        System.out.println("CNPJ do fabricante: " + this.fabricante.cnpj);
    }
}
