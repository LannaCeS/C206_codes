package br.inatel.csi;

public class Main {
    public static void main(String[] args) {

        //Instâncias
        Jogador jogador = new Jogador();

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();

        jogador.destruiu(bloco1);
        jogador.destruiu(bloco2);

        System.out.println(Conversor.converter(jogador));

        /* jogador.destruiu(bloco3);
        System.out.println(Conversor.converter(jogador));

         */

        System.out.println("Pontuação final: " + jogador.getPontos());
        System.out.println("Moedas: " + Conversor.converter(jogador));
        System.out.println("Blocos criados: " + Bloco.getBlocCreated());
        System.out.println("Blocos destruídos: " + Bloco.getBlocDestroyed());
        System.out.println("Blocos restantes: " + Bloco.getBlocCount());
    }
}
