package org.example;

public class Arma {

    private String nomeArma;
    private boolean magica;

    public void setNomeArma(String nome){
        this.nomeArma = nome;
    }

    public void setMagica(boolean magics){
        this.magica = magics;
    }

    public boolean getMagica(){
        return this.magica;
    }

    public String getNomeArma(){
        return this.nomeArma;
    }
}
