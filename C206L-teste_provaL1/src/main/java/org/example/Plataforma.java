package org.example;

public class Plataforma {

    String nome;
    String criador;
    Jogo [] jogos = new Jogo[3];

    String nomeMaisCaro = "";
    String nomeMaisBarato = "";
    double maiorPreco;
    double menorPreco;

    public void mostraInfo(){
        System.out.println("Nome da plataforma: "+ this.nome);
        System.out.println("Criador da plataforma: "+ this.criador);
        System.out.println("-------------- Infos dos jogos ----------------");
        for(Jogo games : jogos){
            if(games!=null) {
                games.mostraInfo();
            }
        }
    }

    public void adicionarJogo(Jogo jogo){
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato(){

        if(jogos[0]!=null) {
            nomeMaisCaro = jogos[0].nome;
            nomeMaisBarato = jogos[0].nome;
            menorPreco = jogos[0].preco;
            maiorPreco = jogos[0].preco;
        }
        for(int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null) {
                if (jogos[i].preco >= maiorPreco) {
                    nomeMaisCaro = jogos[i].nome;
                    maiorPreco = jogos[i].preco;
                }
                if (jogos[i].preco < menorPreco) {
                    nomeMaisBarato = jogos[i].nome;
                    menorPreco = jogos[i].preco;
                }
            }
        }
            System.out.println("Jogo mais barato: " + nomeMaisBarato);
            System.out.println("Jogo mais caro: " + nomeMaisCaro);
    }

    public void calculaDlc(){
        int dlcs = 0;
        for(Jogo games : jogos){
            if(games.dlc){
                dlcs++;
            }
        }
        System.out.println("Atualmente, " + dlcs + " jogos possuem dlc");
    }
}
