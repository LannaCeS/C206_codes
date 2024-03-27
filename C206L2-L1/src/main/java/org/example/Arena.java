package org.example;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Arena {
    //classe todo_

    //Atributos
    String nome;
    String lugar;
    Rapper []rappers;

    //Métodos

    //Construtor
    public Arena(String nome, String lugar){
        this.nome = nome;
        this.lugar = lugar;
        //Composição com a classe Rapper
        this.rappers = new Rapper[7];
    }

    public void addRapper(Rapper rapper){
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] == null){
                rappers[i] = rapper;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("~~~~ Informações da Arena ~~~~");
        System.out.println("Nome: "+this.nome);
        System.out.println("Lugar: "+this.lugar);
        if(rappers[0]!=null) {
            System.out.println("~~~~~~ Rappers: ~~~~~~~");
            for (int i = 0; i < rappers.length; i++) {
                if(rappers[i]!=null){
                    rappers[i].mostraInfo();
                }
            }
        }
        System.out.println("----------------------------------------------");

    }

    public void microfoneDou(){
        //rappers de microfone dourado
        int dourado = 0; //contador de mics dourados

        for(Rapper rap : rappers){
            if(rap!=null){ //sem essa conferência, NullPointerException aparece
                if(rap.microfone.material.equals("Dourado")){
                    System.out.println(rap.nome);
                    dourado++;
                }
            }
        }
        if(dourado == 0){
            System.out.println("Nenhum rapper tem microfone dourado na arena");
        }
    }

    public void ranking(){
        //primeiro e último da batalha
        if(rappers[0]!=null) {
            float maiorNota = rappers[0].nota;
            float menorNota = rappers[0].nota;
            String nomeMaiorNota = rappers[0].nome;
            String nomeMenorNota = rappers[0].nome;

            for (int i = 0; i < rappers.length; i++) {
                if (rappers[i] != null) {
                    if (rappers[i].nota >= maiorNota) {
                        maiorNota = rappers[i].nota;
                        nomeMaiorNota = rappers[i].nome;
                    }
                    if (rappers[i].nota <= menorNota) {
                        menorNota = rappers[i].nota;
                        nomeMenorNota = rappers[i].nome;
                    }
                }
            }

            System.out.println("Primeiro lugar: "+nomeMaiorNota+", com nota: "+maiorNota);
            System.out.println("último lugar: "+nomeMenorNota+", com nota: "+menorNota);
        }else{
            System.out.println("Nenhuma batalha foi finalizada");
        }
    }
}
