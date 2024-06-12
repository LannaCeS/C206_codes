package org.example;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //flags
        boolean again = true;

        //Instâncias
        Arquivo archive = new Arquivo();
        List<Aluno> alunos;

        //Menu de opções
        while(again) {
            try {
                System.out.println();
                System.out.println("-----------Menu Inatel--------------");
                System.out.println("1- Matricular aluno");
                System.out.println("2- Informações dos nossos alunos");
                System.out.println("3- Alunos com filtro de pesquisa: da menor média a maior");
                System.out.println("4- Quantidade de alunos em cada curso");
                System.out.println("5- Sair");

                int op = sc.nextInt();
                sc.nextLine();

                switch (op){
                    case 1:
                        //salvar infos dos alunos no arquivo
                        //variáveis
                        boolean errado = true;
                        boolean wrong = true;
                        String curso = "";

                        //colher infos
                        //NOME
                        System.out.println("Nome:");
                        String nome = sc.nextLine();
                        //CURSO
                        System.out.println("Curso:");
                        curso = sc.nextLine();
                        if (curso.equals("Computação") | curso.equals("Software") | curso.equals("Telecomunicações")) {
                            //MATRÍCULA
                            System.out.println("Matrícula:");
                            int matricula = sc.nextInt();
                            sc.nextLine();
                            //MÉDIA
                            System.out.println("Média:");
                            float media = sc.nextFloat();
                            if (media <= 0) {
                                throw new InfoInvalidaException("Insira uma média válida");
                            } else {
                                Aluno aluno = new Aluno(nome, curso, matricula, media);
                                //salvar no arquivo
                                archive.escrever(aluno);
                            }
                        } else {
                            throw new InfoInvalidaException("Insira um curso válido: Computação, Software ou Telecomunicações");
                        }
                        break;

                    case 2:
                        //ler arquivo e retornar as infos dos alunos
                        alunos = archive.ler();

                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println("Nome: " + alunos.get(i).getNome());
                            System.out.println("Curso: "+ alunos.get(i).getCurso());
                            System.out.println("Matrícula: "+ alunos.get(i).getMatricula());
                            System.out.println("Média: "+ alunos.get(i).getMedia());
                            System.out.println("------------------------------------");
                        }
                        break;

                    case 3:
                        //ler arquivo e ordenar os alunos de acordo com a média
                        alunos = archive.ler();
                        Collections.sort(alunos);

                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println("Nome: " + alunos.get(i).getNome());
                            System.out.println("Curso: "+ alunos.get(i).getCurso());
                            System.out.println("Matrícula: "+ alunos.get(i).getMatricula());
                            System.out.println("Média: "+ alunos.get(i).getMedia());
                            System.out.println("------------------------------------");
                        }
                        break;

                    case 4:
                        //quantidade de alunos de cada curso
                        int comp, software, telecom; //contadores
                        comp = 0;
                        software = 0;
                        telecom = 0;

                        alunos = archive.ler();
                        for (int i = 0; i < alunos.size(); i++) {
                            if(alunos.get(i).getCurso().equals("Computação")){
                                comp++;
                            } else if (alunos.get(i).getCurso().equals("Software")) {
                                software++;
                            } else if (alunos.get(i).getCurso().equals("Telecomunicações")) {
                                telecom++;
                            }
                        }

                        System.out.println("Computação: "+ comp+ " alunos");
                        System.out.println("Software: "+ software+ " alunos");
                        System.out.println("Telecomunicações: "+ telecom+ " alunos");
                        break;

                    case 5:
                        //sair
                        again = false;
                        System.out.println("Obrigado por contar com o Inatel!");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Insira uma opção válida");
                sc.nextLine();
            }catch (InfoInvalidaException i){
                System.out.println(i.getMessage());
            }
        }
    }
}