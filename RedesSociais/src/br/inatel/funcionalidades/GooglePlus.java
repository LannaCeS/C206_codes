package br.inatel.funcionalidades;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    //Construtor
    public GooglePlus (String senha, int numAmigos){
        super(senha, numAmigos);
    }

    //Interfaces
    @Override
    public void fazStreaming(){
        System.out.println("Faz streaming no GooglePlus!");
    }

    @Override
    public void compartilhar(){
        System.out.println("Compartilhou uma publicação no GooglePlus!");
    }

    //Herança
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario(){
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }
}
