package org.example;

public class Sargento extends Soldado implements Defesa{
    //subclasse
    //Atributos
    private String especializacao;
    private int experienciaCombate;

    //Métodos
    //Construtor
    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate){
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    public void mostraInfo(){
        if(this.itemEspecial!=null){
            this.experienciaCombate+=300;
        }
        super.mostraInfo();
        System.out.println("Especialização: "+ this.especializacao);
        System.out.println("Experiência de Combate: "+ this.experienciaCombate);
        System.out.println("-------------------------------------------------");
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
        if(this.experienciaCombate > 650){
            System.out.println(this.getNome()+ " conseguiu se defender");
        }else{
            System.out.println(this.getNome()+ " não se defendeu");
        }
    }
}
