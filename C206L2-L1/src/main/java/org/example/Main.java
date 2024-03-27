package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean voltar = true;

        //Instâncias
        Arena arena = new Arena("Arena da Rima", "Cidade das batalhas");

        while(voltar) {
            //Menu
            try {
                System.out.println();
                System.out.println("~~~~ Bem-vindo(a) à arena " + arena.nome + "! ~~~~");
                System.out.println("------ Menu ------");
                System.out.println("1- Adicionar rappers");
                System.out.println("2- Informações da arena e seus rappers");
                System.out.println("3- Nomes dos rappers de microfone dourado");
                System.out.println("4- Rappers em primeiro e em último lugar na batalha");
                System.out.println("5- Sair");
                System.out.println("---------------------------------------------------------");
                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        //add rapper
                        System.out.println("Nome: ");
                        String name = sc.nextLine();
                        System.out.println("Idade: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        String mic = "";
                        boolean micro = true;
                        while(micro) {
                            System.out.println("Microfone: ");
                            mic = sc.nextLine();
                            if(mic.equals("Dourado") || mic.equals("madeira") || mic.equals("plastico")){
                                micro = false;
                            }else{
                                System.out.println("Insira um tipo válido de microfone (Dourado, madeira ou plastico)");
                            }
                        }

                        float score = 0;
                        boolean grade = true;
                        while (grade) {
                            System.out.println("Nota na batalha: ");
                            score = sc.nextFloat();
                            if (score > 10 || score < 0) {
                                grade = true;
                                System.out.println("Insira uma nota de 0-10");
                            }else{
                                grade = false;
                            }
                        }

                        Rapper rapper = new Rapper(name, score, age, mic);
                        arena.addRapper(rapper);
                        break;

                    case 2:
                        //infos da arena e rappers
                        arena.mostraInfo();
                        break;

                    case 3:
                        //rappers com mic dourado
                        arena.microfoneDou();
                        break;

                    case 4:
                        //primeiro e último lugar
                        arena.ranking();
                        break;

                    case 5:
                        //sair do menu
                        System.out.println("Obrigada por batalhar com a gente! ;)");
                        voltar = false;
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }catch(Exception InputMismatchException){
                System.out.println("Insira um dado válido");
                sc.nextLine();
            }
        }
    }
}