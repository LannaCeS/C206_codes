package org.example;

public class Elfo extends Habitante implements Cura{

    private String tribo;

    public Elfo(String nome, int idade, float energia, Arma arma){
        super(nome, idade, energia, arma);
    }

    public void setTribo (String tribo){
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println("O elfo "+this.nome+" está viajando...");

    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: " +this.tribo);
    }

    @Override
    public void curar(){
        this.energia = this.energia * 1.15f;
        System.out.println("Herói " +this.nome+ " curado!");
    }
}
