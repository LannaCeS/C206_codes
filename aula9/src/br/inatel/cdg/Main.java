package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //static faz com que a variável não pertença mais à instância, e sim à classe
        //public static int getNum(){} -> método estático pertence à classe -> pode ser chamado sem instância -> método utilitário/helper
        //pegar o valor chamando a CLASSE.getNum()

        Scanner scanner = new Scanner(System.in);

        //Instâncias
        Asteroide aster = new Asteroide("Luz", "Grande");
        Nave nave = new Nave("Mastermind", 300, "Explosivo");
        Nave nave2 = new Nave("Blazer", 450, "Normal");

        //tiros
        nave.atirar(aster);
        nave2.atirar(aster);


    }
}