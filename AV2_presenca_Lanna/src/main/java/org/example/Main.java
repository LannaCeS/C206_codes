package org.example;

public class Main {
    public static void main(String[] args) {

        //Instâncias
        TerraMedia terraMedia = new TerraMedia();
        Arma arma1 = new Arma();
        arma1.setNomeArma("Lança chamas");
        arma1.setMagica(false);
        Habitante anao = new Anao("Hobbit", 27, 100, arma1);

        Arma arma2 = new Arma();
        arma2.setMagica(true);
        arma2.setNomeArma("Arco e flecha");
        Habitante elfo = new Elfo("Danny", 19, 200, arma2);
        
        Arma arma3 = new Arma();
        arma3.setNomeArma("Varinha");
        arma3.setMagica(true);
        Habitante mago = new Mago("Dumbledore", 78, 300, arma3);

        //adicionando os habitantes à fila de heróis
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        terraMedia.listarHabitantes();
    }
}