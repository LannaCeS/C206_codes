package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Entre com seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Entre com o nome da sua mae: ");
        scanner.next();
        String nomemae = scanner.nextLine();

    }
}