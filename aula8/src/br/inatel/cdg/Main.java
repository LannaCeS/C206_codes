package br.inatel.cdg;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de classes
        Conta conta;
        Cliente [] clientex = new Cliente[3];

        //Criando nova conta
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao banco 'New Saldo = 90', onde todos iniciam com 90 reais na conta!");
        System.out.println("~~ Criando sua nova conta ~~");
        System.out.println("Nome: ");
        String nomecliente = scanner.nextLine();
        System.out.println("CPF: ");
        long cpf = scanner.nextLong();

        Cliente cliente = new Cliente(nomecliente, cpf);
        cliente.setNome(nomecliente);
        cliente.setCpf(cpf);

        for(int i = 0; i < clientex.length; i++){
            if(clientex[i] == null) {
                clientex[i] = cliente;
                break;
            }
        }

        System.out.println("É conta conjunta? (true -> Sim ou false -> Não)");
        boolean conjunta = scanner.nextBoolean();
        scanner.nextLine();

        if(conjunta){
            System.out.println("Nome: ");
            String nomecliente2 = scanner.nextLine();
            System.out.println("CPF: ");
            long cpf2 = scanner.nextLong();

            Cliente cliente2 = new Cliente(nomecliente2, cpf2);
            cliente2.setNome(nomecliente2);
            cliente2.setCpf(cpf2);

            for(int i = 0; i < clientex.length; i++){
                if(clientex[i] == null) {
                    clientex[i] = cliente2;
                    break;
                }
            }
        }

        Random random = new Random();

        int numConta = random.nextInt();

        conta = new Conta(90.00f, 1000.00f, clientex);
        conta.setNumero(numConta);
        System.out.println("Numero da conta: "+conta.getNumero());
        System.out.println("Limite: "+conta.getLimite());
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Dados do cliente: ");

        for (int i = 0; i < clientex.length; i++) {
            if(clientex[i]!=null) {
                System.out.println("Nome: " + conta.clientes[i].getNome());
                System.out.println("CPF: " + conta.clientes[i].getCpf());
            }
        }
    }
}
