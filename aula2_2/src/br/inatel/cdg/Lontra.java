package br.inatel.cdg;

public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de lontra");
    }

    @Override
    public void nadar(){
        System.out.println(this.nome+ " nadando...");
    }
}
