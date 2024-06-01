package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Instancia de Arquivo
        Arquivo archive = new Arquivo();

        //Variáveis
        String nome, endereco, cpf;
        int idade, op;

        //Variáveis de controle
        boolean again = true;
        boolean wrong;

        //Menu
        while(again) {
            try{

                System.out.println();
                System.out.println("          GARROSERRA");
                System.out.println("         ~~~~Menu~~~~");
                System.out.println("1- Cadastrar cliente");
                System.out.println("2- Lista de clientes");
                System.out.println("3- Clientes ordenados em ordem alfabética");
                System.out.println("4- Clientes ordenados de Z-A");
                System.out.println("5- Sair");

                op = scanner.nextInt();
                scanner.nextLine();

                switch(op){
                    case 1:
                        //cadastro
                        wrong = true;
                        while(wrong) {
                            try {
                                System.out.println("Insira as informações do cliente");
                                System.out.println("Nome: ");
                                nome = scanner.nextLine();
                                System.out.println("CPF: ");
                                cpf = scanner.nextLine();
                                System.out.println("Idade: ");
                                idade = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Endereço: ");
                                endereco = scanner.nextLine();
                                wrong = false;

                                //Instanciando o cliente
                                Cliente cliente = new Cliente(nome, cpf, endereco, idade);

                                //Inserindo o cliente no arquivo
                                archive.escrever(cliente);

                            } catch (InputMismatchException e) {
                                scanner.nextLine();
                                System.out.println("Realize o cadastro novamente");
                            }
                        }
                    break;
                    case 2:
                        //lista de clientes para listar no terminal
                        //LER TXT
                        List<Cliente>clientes = archive.ler();
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println("Nome: " +clientes.get(i).getNome());
                            System.out.println("CPF: " +clientes.get(i).getCPF());
                            System.out.println("Idade: " +clientes.get(i).getIdade());
                            System.out.println("Endereço: " +clientes.get(i).getEndereco());
                            System.out.println("------------------------------------------------");
                        }

                    break;
                    case 3:
                        //ordenar em ordem alfabética -> implementar Comparable
                        //LER TXT
                        List<Cliente> clientex = archive.ler();
                        Collections.sort(clientex);
                        for (int i = 0; i < clientex.size(); i++) {
                            System.out.println("Nome: " + clientex.get(i).getNome());
                        }

                    break;
                    case 4:
                        //inverter a ordem alfabética -> .reverseOrder
                        //LER TXT
                        List<Cliente>clienteList = archive.ler();
                        Collections.sort(clienteList,Collections.reverseOrder());
                        for (int i = 0; i <clienteList.size() ; i++) {
                            System.out.println("Nome: " + clienteList.get(i).getNome());
                        }
                    break;

                    case 5:
                        //sair
                        again = false;
                        System.out.println("Agradecemos por trabalhar com a GarroSerra!");
                    break;
                }

            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Insira uma resposta válida");
            }
        }
    }
}