package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Produto []produto = new Produto[10];
       Empresa e1 = new Empresa("MAC");

       Scanner scanner = new Scanner(System.in);
       boolean flg = true;

       while(flg){
           System.out.println("----------------------------------------------------");
           System.out.println("Bem-vindo ao menu da empresa!");
           System.out.println("1- Adicionar produto");
           System.out.println("2- Mostrar as infos da empresa");
           System.out.println("3- Sair do Menu");

           int op = scanner.nextInt();

           switch (op){
               case 1:
                   scanner.nextLine();
                   System.out.println("Entre com as infos do produto: ");
                   System.out.println("Nome: ");
                   String nome = scanner.nextLine();
                   System.out.println("Nota:");
                   int nota = scanner.nextInt();
                   System.out.println("Quantidade: ");
                   int quant = scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Nome do fabricante: ");
                   String nomef = scanner.nextLine();
                   System.out.println("CNPJ do fabricante: ");
                   int cnpjfab = scanner.nextInt();

                   Produto product = new Produto(nome, nota, quant, nomef, cnpjfab);
                   e1.adicionaProduto(product);
                   break;

               case 2:
                   if(e1!=null) {
                       e1.mostraInfo();
                       break;
                   }else{
                       System.out.println("Não há produtos cadastrados");
                   }

               case 3:
                   break;

           }
       }
    }
}