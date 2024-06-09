package org.example;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variáveis de controle de fluxo (flags)
        boolean again = true;
        boolean wrong = true;

        //Instâncias
        Arquivo archive = new Arquivo();
        List<Produto> produtos;

        //Menu de opções
        while(again) {
            try {
                System.out.println();
                System.out.println("-----------Menu--------------");
                System.out.println("1- Cadastrar produto");
                System.out.println("2- Informações dos produtos");
                System.out.println("3- Produtos com filtro de pesquisa: do mais barato ao mais caro");
                System.out.println("4- Quantidade dos produtos de cada tipo");
                System.out.println("5- Sair");

                int op = sc.nextInt();
                sc.nextLine();

                switch (op){
                    case 1:
                        //salvar infos no arquivo

                        //variáveis
                        boolean errado = true;
                        String tipo = "";

                        //colher infos
                        System.out.println("Nome:");
                        String nome = sc.nextLine();
                        while(errado) {
                            System.out.println("Tipo:");
                            tipo = sc.nextLine();
                            if (tipo.equals("Comida") | tipo.equals("Higiene") | tipo.equals("Decoração")) {
                                errado = false;
                            } else {
                                throw new InfoInvalidaException("Insira um tipo válido: Comida, Higiene ou Decoração");
                            }
                        }
                        while (wrong) {
                            System.out.println("Preço:");
                            double preco = sc.nextDouble();
                            if (preco <= 0) {
                                throw new InfoInvalidaException("Insira um preço válido");
                            } else {
                                Produto produto = new Produto(nome, preco, tipo);
                                //salvar no arquivo
                                archive.escrever(produto);
                                wrong = false;
                            }
                        }


                    break;

                    case 2:
                        //ler arquivo e retornar infos
                       produtos = archive.ler();

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("Nome: " + produtos.get(i).getNome());
                            System.out.println("Tipo: "+ produtos.get(i).getTipo());
                            System.out.println("Preco: "+ produtos.get(i).getPreco());
                            System.out.println("------------------------------------");
                        }
                    break;

                    case 3:
                        //ler arquivo e ordenar de acordo com preço
                        produtos = archive.ler();
                        Collections.sort(produtos);

                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("Nome: " + produtos.get(i).getNome());
                            System.out.println("Tipo: "+ produtos.get(i).getTipo());
                            System.out.println("Preco: "+ produtos.get(i).getPreco());
                            System.out.println("------------------------------------");
                        }
                    break;

                    case 4:
                        //quantidade de produtos de cada tipo
                        int comida, higiene, decoracao; //contadores
                        comida = 0;
                        higiene = 0;
                        decoracao = 0;

                        produtos = archive.ler();
                        for (int i = 0; i < produtos.size(); i++) {
                            if(produtos.get(i).getTipo().equals("Comida")){
                                comida++;
                            } else if (produtos.get(i).getTipo().equals("Higiene")) {
                                higiene++;
                            } else if (produtos.get(i).getTipo().equals("Decoração")) {
                                decoracao++;
                            }
                        }

                        System.out.println("Comida: "+ comida+ " produtos");
                        System.out.println("Higiene: "+ higiene+ " produtos");
                        System.out.println("Decoração: "+ decoracao+ " produtos");
                    break;

                    case 5:
                        //sair
                        again = false;
                        System.out.println("Obrigada por contar com a 'De Tudo um pouco'!");
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