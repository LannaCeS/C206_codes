package br.inatel.cdg.ex3;

import br.inatel.cdg.ex1.Brownie;
public class Comprador {
    private String nome;
    private double saldo;

    Brownie[] brownies = new Brownie[5];

    public Comprador (String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo - saldo;
    }

    public Comprador(){

    }

    public void setNome(String name){
        this.nome = name;
    }

    public double getSaldo(){
        return saldo;
    }

    public void efetuarCompra(Brownie brownie){
        for(int i = 0; i < brownies.length; i++){
            if(brownies[i] == null){
                brownies[i] = brownie;
                brownie.addCarrinhoDeCompras();
                break;
            }
        }
    }

    public void calculaSaldo(){
        for(int i = 0; i < brownies.length; i++){
            if(brownies[i] != null) {
                saldo += brownies[i].getPreco();
            }
        }
        System.out.println("Valor total: " + this.saldo);
    }
}
