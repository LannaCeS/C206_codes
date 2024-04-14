package org.example;

import java.util.SortedMap;

public class Mago extends Habitante implements Feitico, Cura{
    private String cor;

    public Mago(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }

    @Override
    public void lancaFeitico(){
        System.out.println("O mago "+this.nome+ " lançou um feitiço...");
        this.energia = this.energia * 0.9f;
    }

    @Override
    public void curar(){
        this.energia = this.energia * 1.15f;
        System.out.println("Herói " +this.nome+ " curado!");
    }
}
