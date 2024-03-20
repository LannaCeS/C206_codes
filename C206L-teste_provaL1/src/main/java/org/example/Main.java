package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner para entrada de infos
        Scanner sc = new Scanner(System.in);
        Boolean continuar = true;
        int gamex = 0; //contador para quantidade de jogos

        //Instanciando os objetos das classes
        Plataforma plataforma = new Plataforma();
        plataforma.nome = "Steam";
        plataforma.criador = "Valve Corporation";

        //Menu
        while(continuar){
            System.out.println("----------------------------------");
            System.out.println("~~ Bem-vindo(a) à " + plataforma.nome + " ~~");
            System.out.println("1- Adicionar um jogo");
            System.out.println("2- Informações da plataforma e dos jogos");
            System.out.println("3- Nome do jogo mais caro e do mais barato");
            System.out.println("4- Número de jogos com dlc");
            System.out.println("5- Sair do menu");
            System.out.println("---------------------------------");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    gamex++;
                    Jogo jogo = new Jogo();
                    System.out.println("Nome do jogo:");
                    jogo.nome = sc.nextLine();
                    System.out.println("Gênero:");
                    jogo.genero = sc.nextLine();
                    System.out.println("Tem dlc? (S ou N):");
                    if (sc.nextLine().equals("S"))
                        jogo.dlc = true;
                    else if (sc.nextLine().equals("N"))
                        jogo.dlc = false;
                    else
                        System.out.println("Insira uma resposta válida");
                    System.out.println("Preço:");
                    jogo.preco = sc.nextDouble();

                    plataforma.adicionarJogo(jogo);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    if(gamex<3)
                        System.out.println("Número insuficiente de jogos para análise");
                    else
                        plataforma.mostraMaisCaroBarato();
                    break;
                case 4:
                    plataforma.calculaDlc();
                    break;
                case 5:
                    System.out.println("Obrigada por utilizar a " + plataforma.nome + "!");
                    continuar = false;
                    break;
            }

        }

    }
}