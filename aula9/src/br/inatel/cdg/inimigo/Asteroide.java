package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide (String nome, String tipoAsteroide){
        setNome(nome);
        setTipoAsteroide(tipoAsteroide);
    }

    public void setNome(String name){
        this.nome = name;
    }

    public void setTipoAsteroide(String asteroidType){
        this.tipoAsteroide = asteroidType;
    }

    public String getTipoAsteroide(){
        return tipoAsteroide;
    }

    public String getNome(){
        return nome;
    }

    public void destruir(){
        System.out.println("Asteróide destruído!");
    }
}
