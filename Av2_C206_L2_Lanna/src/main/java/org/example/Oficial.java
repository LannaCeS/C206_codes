package org.example;

public class Oficial extends Soldado implements Defesa{
    //subclasse

    //Atributos
    private String patente;

    //Métodos
    //Construtor
    public Oficial(String nome, long cpf, String patente){
        super(nome, cpf);
        this.patente = patente;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente: "+ this.patente);
        System.out.println("---------------------------------------");
    }

    @Override
    public void usandoItem(){
        if(this.itemEspecial != null) {
            System.out.println(this.getNome() + " utilizando item especial");
        }else{
            System.out.println(this.getNome() + " não tem item especial para utilizar");
        }
    }

    //Interface
    @Override
    public void defender(){
        if(this.itemEspecial!=null){
            System.out.println(this.getNome()+ " conseguiu se defender");
        }else{
            System.out.println(this.getNome()+ " não se defendeu");
        }
    }
}
