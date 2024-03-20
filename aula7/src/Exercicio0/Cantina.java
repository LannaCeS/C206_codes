package Exercicio0;

import Exercicio0.Salgado;

public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        for(Salgado salg : salgados){
            System.out.println(salg.nome);
        }
    }
}
