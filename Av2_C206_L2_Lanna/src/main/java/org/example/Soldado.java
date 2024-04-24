package org.example;

public abstract class Soldado {

    //Superclasse
    //Atributos
    static int qtdSoldado = 0;
    private String nome;
    private long cpf;

    public ItemEspecial itemEspecial;

    //Métodos
    //Construtor
    public Soldado(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado++;
    }
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        if(this.itemEspecial!= null) {
            if(this.itemEspecial.tipo!=null)
                System.out.println("Item especial: " + this.itemEspecial.tipo);
        }
    }

    public abstract void usandoItem(); //molde obrigatório para os métodos "usandoItem" nas subclasses

    public String getNome(){ //meio de acesso ao "this.nome" para as outras classes
        return this.nome;
    }
}
