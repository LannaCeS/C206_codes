package org.example;

public class Aldeia {

    //Atributos
    String nome;
    int qtdMoradores;
    String regiao;

    Ninja[] ninjas;

    //Métodos

    //construtor
    public Aldeia(String nome, int qtdMoradores, String regiao){
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
        this.ninjas = new Ninja[10];
    }
    public void adicionarNinja(Ninja ninja){
        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("~~~~ Informações da Aldeia ~~~~");
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade de moradores: "+this.qtdMoradores);
        System.out.println("Região: "+this.regiao);
        System.out.println("~~~~ Informações dos ninjas ~~~~");
        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i]!=null)
                ninjas[i].mostraInfo();
        }
    }

    public void rankingS(){
        for(int i = 0; i<ninjas.length; i++){
            if(ninjas[i]!=null) {
                if (ninjas[i].ranking.equals("S")) {
                    System.out.println(ninjas[i].nome);
                }
            }
        }
        System.out.println("-----------------------------");
    }

    public void qtdTitulos(){
        //contadores por título
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;

        for(Ninja ninja : ninjas){
            if(ninja!=null) {
                if (ninja.titulo.equals("Gennin")) {
                    gennin++;
                } else if (ninja.titulo.equals("Chunnin")) {
                    chunnin++;
                } else if (ninja.titulo.equals("ANBU")) {
                    anbu++;
                }
            }
        }

        System.out.println("Gennin: "+gennin);
        System.out.println("Chunnin: "+chunnin);
        System.out.println("ANBU: "+anbu);
        System.out.println("-------------------------------");

    }
}
