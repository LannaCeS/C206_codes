package Exercicio0;

import Exercicio0.Salgado;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Exercicio0.Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Empada";
        Salgado salgado2 = new Salgado();
        salgado2.nome = "Hamburguer";
        Salgado salgado3 = new Salgado();
        salgado3.nome = "Pao de Queijo";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

    }
}