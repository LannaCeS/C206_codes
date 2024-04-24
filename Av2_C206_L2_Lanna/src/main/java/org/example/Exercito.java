package org.example;

public class Exercito {

    //Atributos
    private String nome;
    private Soldado[] soldados;

    //Métodos
    //Construtor
    public Exercito(String nome, Soldado soldado){
        this.nome = nome;
        this.soldados = new Soldado[10];
        soldados[0] = soldado;
    }

    public void addSoldado(Soldado s){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i] == null){
                soldados[i] = s;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("----- EXÉRCITO -----");
        System.out.println("Nome: "+ this.nome);
        System.out.println("----- SOLDADOS -----");
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i]!=null){
                soldados[i].mostraInfo();
            }

        }
    }
}
