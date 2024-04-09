package br.inatel.csi;

public class Conversor {

    public static double converter(Jogador jogador){
        double moedas = 100 * jogador.getPontos();

        return moedas;
    }
}
