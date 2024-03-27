package org.example;

import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Float.valueOf;

public class Main {
    public static void main(String[] args) {

        //Instâncias
        Locadora locadora = new Locadora("Loucadora", "00000000-00", "Rua das Locadoras de Carro, 177");
        Scanner sc = new Scanner(System.in);
        Carro carro;

        //variáveis
        boolean voltar = true;
        int alugaveis = 0;

        //Menu da Locadora
        while(voltar) {
            System.out.println();
            System.out.println("~~~~ Bem-vindo(a) ao menu da locadora de carros " + locadora.nome + "! ~~~~");
            System.out.println("1- Adicionar um carro");
            System.out.println("2- Informações da locadora e seus carros");
            System.out.println("3- Porcentagem dos carros disponíveis para aluguel");
            System.out.println("4- Alugar um carro");
            System.out.println("5- Sair");
            System.out.println("-----------------------------------------------------");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    //add carro
                    System.out.println("Modelo: ");
                    String model = sc.nextLine();
                    System.out.println("Cor: ");
                    String color = sc.nextLine();
                    System.out.println("Velocidade máxima: ");
                    float veloc = sc.nextFloat();
                    boolean alugado = false;
                    alugaveis++;
                    locadora.carrosParaAlugar = alugaveis;

                    //Agregação do carro à locadora e composição do mesmo com o motor
                    carro = new Carro(model, color, alugado, veloc);
                    locadora.adicionarCarro(carro);
                    break;
                case 2:
                    //infos
                    locadora.mostraInfo();
                    break;
                case 3:
                    //porcentagem para aluguel
                    System.out.println(locadora.contarCarrosParaAlugar()+"%");
                    break;
                case 4:
                    //alugar carro
                    boolean again = true;
                    while(again) {
                        System.out.println("Qual o modelo e cor do carro que deseja alugar? (Insira no molde: modelo,cor)");
                        String[] infos = sc.nextLine().split(",");
                        System.out.println("Qual a velocidade máxima que ele atinge?");
                        int vel = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < locadora.carros.length; i++) {
                            if(locadora.carros[i]!=null) {
                                if (infos[0] != null && infos[1] != null) {
                                    again = false;
                                    if (locadora.carros[i].modelo.equals(infos[0])) {
                                        if (locadora.carros[i].cor.equals(infos[1])) {
                                            if (locadora.carros[i].motor.velocidadeMaxima == vel) {
                                                locadora.alugarCarro(i);
                                                alugaveis --;
                                                locadora.carrosParaAlugar = alugaveis;
                                                break;
                                            }else{
                                                System.out.println("Carro não encontrado/não disponível para aluguel!");
                                            }
                                        }else{
                                            System.out.println("Carro não encontrado/não disponível para aluguel!");
                                        }
                                    }else{
                                        System.out.println("Carro não encontrado/não disponível para aluguel!");
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Obrigado e volte sempre!");
                    voltar = false;
                    break;
            }
        }

    }
}