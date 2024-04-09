package br.inatel.csi;

public class Jogador {

    private int pontos = 0;

    public int getPontos(){
        return pontos;
    }
    public void destruiu(Bloco bloco){
        pontos += 50;
        bloco.destruido();
    }
}
