package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instâncias
        Plataforma plataforma = new Plataforma("Netflix");
        Scanner sc = new Scanner(System.in);

        //variáveis
        boolean continuar = true;
        int nota;
        boolean answer;
        boolean fim = false;

        //Menu
        while(continuar) {
            System.out.println("----------------------------------");
            System.out.println("~~ Registrador de Séries da Netflix ~~");
            System.out.println("1- Adicionar uma série");
            System.out.println("2- Informações da plataforma e das séries");
            System.out.println("3- Nome da série finalizada com mais temporadas");
            System.out.println("4- Porcentagem e média da nota das séries que têm mais de 3 temporadas");
            System.out.println("5- Sair");
            System.out.println("----------------------------------");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    //add série
                    System.out.println("Nome:");
                    String name = sc.nextLine();
                    System.out.println("Número de Temporadas: ");
                    int temp = sc.nextInt();
                    sc.nextLine();

                    do {
                        System.out.println("Foi finalizada? (S ou N)");
                        answer = false;
                        String ans = sc.nextLine();

                        if (ans.equals("S")) {
                            fim = true;
                            answer = true;
                        }else if (ans.equals("N")) {
                            fim = false;
                            answer = true;
                        }else
                            System.out.println("Insira uma resposta válida");

                    }while(!answer);

                    System.out.println("Nome do diretor: ");
                    String nomeDir = sc.nextLine();

                    do {
                        System.out.println("Nota (0-10): ");
                        nota = sc.nextInt();
                    }while(nota<0 || nota>10);

                    //Instanciando a série, agregando a plataforma e compondo o diretor
                    Serie serie = new Serie(name, nota, temp, fim, nomeDir);
                    serie.plataforma = plataforma;

                    //adicionando a série ao catálogo
                    plataforma.addSerie(serie);
                    break;

                case 2:
                    //infos
                    plataforma.mostraInfo();
                    break;

                case 3:
                    //série com mais temp
                    String serieLonga = plataforma.serieMaisLongaFinalizada();
                    System.out.println(serieLonga);
                    break;

                case 4:
                    //média e porcentagem de 3+ temporadas
                    plataforma.mediaPorcentagem();
                    break;


                case 5:
                    //sair
                    continuar = false;
                    System.out.println("~~ Obrigada por utilizar a " + plataforma.nome + "! ~~");
                    break;
            }

        }

    }
}