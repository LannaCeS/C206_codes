package br.inatel.cdg.ex1;

import br.inatel.cdg.ex3.Comprador;

public class Brownie {
    protected String nome;
    protected double preco ;
    protected String sabor;

    static double valor = 0;

    Comprador comprador = new Comprador();

    public Brownie (String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public double getPreco(){
        return this.preco;
    }

    public void addCarrinhoDeCompras(){
        System.out.println(this.nome + " adicionado ao carrinho!");
        valor += preco;
    }

    public void calculaValorTotalCompra(){
        comprador.calculaSaldo();
    }

    public void mostraInfo(){
        System.out.println("Preço: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor total: " + valor);
    }
}
