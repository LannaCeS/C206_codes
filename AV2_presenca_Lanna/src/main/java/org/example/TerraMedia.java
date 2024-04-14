package org.example;

public class TerraMedia {

    Habitante [] herois;

    public TerraMedia(){
        herois = new Habitante[10];
    }
    public void addHabitante(Habitante habitante){
        for(int i=0 ; i<herois.length; i++){
            if(herois[i]==null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        System.out.println("------- Habitantes ----------");
        for (int i = 0; i < herois.length; i++) {
            if(herois[i]!=null) {
                if (herois[i] instanceof Anao) {
                    Anao anao = (Anao) herois[i];
                    anao.setAltura(1.35f);
                    anao.setReino("Reino do Norte");
                    herois[i].mostraInfo();
                    anao.minerar();
                    anao.atacar();

                } else if (herois[i] instanceof Elfo) {
                    Elfo elfo = (Elfo) herois[i];
                    elfo.setTribo("Tribo Nascente");
                    herois[i].mostraInfo();
                    elfo.atacar();
                    elfo.curar();
                    elfo.viajar();

                } else if (herois[i] instanceof Mago) {
                    Mago mago = (Mago) herois[i];
                    mago.setCor("roxo");
                    herois[i].mostraInfo();
                    mago.lancaFeitico();
                    mago.atacar();
                    mago.curar();
                }

                System.out.println("-----------------------------------------");
                System.out.println();
            }
        }
    }
}
