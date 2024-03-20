package org.example;

public class Jogo {

    String nome;
    String genero;
    double preco;
    boolean dlc;

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Gênero: "+this.genero);
        System.out.println("Dlc: "+this.dlc);
        System.out.println("Preço: R$"+this.preco);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
