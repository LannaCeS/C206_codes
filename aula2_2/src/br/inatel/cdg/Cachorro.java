package br.inatel.cdg;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de cachorro");
    }
}
