package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean voltar = true;

        //Instâncias (Aldeia é a classe to_do e Ninja é a classe parte por composição
        Aldeia aldeia = new Aldeia("Best", 500, "Sul");

        //Menu interativo
            //try {
                while(voltar) {
                    System.out.println();
                    System.out.println("----------------------------");
                    System.out.println("~~Aldeia do " + aldeia.regiao + "~~");
                    System.out.println("1- Adicionar ninja");
                    System.out.println("2- Informações dos ninjas e da aldeia");
                    System.out.println("3- Ninjas no ranking S");
                    System.out.println("4- Quantidade de ninjas por título (Gennin, Chunnin ou ANBU)");
                    System.out.println("5- Sair");
                    System.out.println("----------------------------");

                    int op = sc.nextInt();
                    sc.nextLine();

                    switch (op) {
                        case 1:
                            //add ninja
                            boolean certo = false;
                            boolean ans = false;
                            String titulo = "";
                            String ranking = "";

                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Idade: ");
                            int idade = sc.nextInt();
                            sc.nextLine();
                            while (!certo) {
                                System.out.println("Título (Gennin, Chunnin ou ANBU): ");
                                titulo = sc.nextLine();
                                if (titulo.equals("Chunnin") || titulo.equals("Gennin") || titulo.equals("ANBU")) {
                                    certo = true;
                                } else {
                                    //resposta inválida
                                    System.out.println("Resposta inválida!");
                                }
                            }
                            while (!ans) {
                                System.out.println("Ranking (S, A, B, C ou D): ");
                                ranking = sc.nextLine();
                                if (ranking.equals("S") || ranking.equals("A") || ranking.equals("B") || ranking.equals("C") || ranking.equals("D")) {
                                    ans = true;
                                } else {
                                    //resposta inválida
                                    System.out.println("Resposta inválida!");
                                }
                            }
                            Ninja ninja = new Ninja(nome, idade, titulo, ranking);

                            aldeia.adicionarNinja(ninja);
                            break;
                        case 2:
                            //infos dos ninjas e aldeia
                            aldeia.mostraInfo();
                            voltar = true;
                            break;
                        case 3:
                            //ninjas do ranking S
                            aldeia.rankingS();
                            voltar = true;
                            break;
                        case 4:
                            //quantidade de ninjas por título
                            aldeia.qtdTitulos();
                            voltar = true;
                            break;
                        default:
                            voltar = false;
                            break;
                    }
                }
            /*}catch(Exception InputMismatchException){
                sc.nextLine();
                System.out.println("Insira valores válidos");
                voltar = true;
            }

             */



    }
}