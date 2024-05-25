package br.inatel.funcionalidades;

public abstract class RedeSocial {

    //Atributos
    protected String senha;
    protected int numAmigos;

    //Construtor
    public RedeSocial(String senha, int numAmigos){
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    //Métodos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação!");
    }
}
