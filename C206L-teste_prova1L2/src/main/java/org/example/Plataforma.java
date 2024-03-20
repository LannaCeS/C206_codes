package org.example;

public class Plataforma {
    //Classe parte por agregação

    //Atributos
    String nome;
    Serie[] series = new Serie[3];
    int maisTemp;
    String maiorSerie = "";

    //Métodos

    public Plataforma(String nome){
        this.nome = nome;
    }
    public void mostraInfo(){
        System.out.println("------- Sobre a plataforma ---------");
        System.out.println("Nome: "+this.nome);
        System.out.println("~~ Séries em catálogo ~~");
        for(Serie seriex : series){
            if(seriex!=null)
                seriex.mostraInfo();
        }
    }

    public void addSerie(Serie serie){
        for (int i = 0; i < series.length; i++) {
            if(series[i] == null){
                series[i] = serie;
                break;
            }
        }
    }

    public String serieMaisLongaFinalizada(){
        for (int i = 0; i < series.length; i++) {
            for(Serie seriex : series) {
                if (seriex != null) {
                    if(seriex.finalizada) {
                        maiorSerie = seriex.nome;
                        maisTemp = seriex.temporadas;
                        break;
                    }
                }
            }
            if(maiorSerie.isEmpty()){
                maiorSerie = "Nenhuma série finalizada no sistema";
                break;
            }
            if(series[i]!=null) {
                if(series[i].finalizada) {
                    if (series[i].temporadas >= maisTemp) {
                        maisTemp = series[i].temporadas;
                        maiorSerie = series[i].nome;
                    }
                }
            }
        }

        return maiorSerie;
    }

    public void mediaPorcentagem(){
        double sum = 0; //#soma das notas
        int count = 0; //# séries
        int count3 = 0; //# de séries com mais de 3 temp

        for(Serie seriex1 : series){
            if(seriex1!=null) {
                if (seriex1.temporadas >= 3) {
                    sum = sum + seriex1.nota;
                    count3++;
                }
                count++;
            }
        }

        double media = sum/count3;
        float porcent = ((float)count3/(float)count) * 100;

        System.out.println("Media das notas: " + media);
        System.out.println("Porcentagem de séries com mais de 3 temporadas: "+ porcent + "%");
    }
}
