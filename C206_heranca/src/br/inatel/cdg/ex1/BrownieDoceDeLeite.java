package br.inatel.cdg.ex1;

public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando doce de leite...");
    }
}

