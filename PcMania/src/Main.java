import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variáveis
        boolean voltar = true;
        int i = 0;

        //Scanner para entrada de informações dadas pelo usuário
        Scanner scanner = new Scanner(System.in);


        //Instâncias

        Cliente cliente = new Cliente();

        HardwareBasico hardwareBasico11 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico hardwareBasico12 = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hardwareBasico13 = new HardwareBasico("HD", 500);

        HardwareBasico hardwareBasico21 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico hardwareBasico22 = new HardwareBasico("Memória RAM", 16);
        HardwareBasico hardwareBasico23 = new HardwareBasico("HD", 1000);

        HardwareBasico hardwareBasico31 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico hardwareBasico32 = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hardwareBasico33 = new HardwareBasico("HD", 2000);

        Computador computador1 = new Computador("Positivo", 3300.00f, "Linux Ubuntu", 32, hardwareBasico11, hardwareBasico12, hardwareBasico13);
        Computador computador2 = new Computador("Acer", 8800.00f, "Windows 8", 64, hardwareBasico21, hardwareBasico22, hardwareBasico23);
        Computador computador3 = new Computador("Vaio", 4800f, "Windows 10", 64, hardwareBasico31, hardwareBasico32, hardwareBasico33);

        MemoriaUSB usbmem1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB usbmem2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB usbmem3 = new MemoriaUSB("HD Externo", 1000);

        //Agregação memória USB e computador
        computador1.addMemoriaUSB(usbmem1);
        computador2.addMemoriaUSB(usbmem2);
        computador3.addMemoriaUSB(usbmem3);

        //Interface com o usuário
        while(voltar) {
            System.out.println();
            System.out.println("~~ Bem-vindo(a) à PcMania ~~");
            System.out.println("Veja as nossas opções de computadores na promoção! ");
            System.out.println("PC1: ");
            computador1.mostraPCConfigs();
            System.out.println("----------------------------------");
            System.out.println("PC2: ");
            computador2.mostraPCConfigs();
            System.out.println("----------------------------------");
            System.out.println("PC3: ");
            computador3.mostraPCConfigs();
            System.out.println("----------------------------------");
            System.out.println();

            System.out.println("Ir para o menu de compras? (S ou N)");
            String answer = scanner.nextLine();
            if(answer.equals("S")) {
                try{
                    System.out.println("Menu de compra: ");
                    System.out.println("1- Comprar PC1");
                    System.out.println("2- Comprar PC2");
                    System.out.println("3- Comprar PC3");
                    System.out.println("4- Voltar ao menu de computadores");
                    System.out.println("5- Sair");
                    int op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {
                        case 1:
                            //processo de compra do PC1
                            if(cliente.nome == null){
                                System.out.println("Insira seus Dados:");
                                System.out.println("Nome: ");
                                String nome = scanner.nextLine();
                                System.out.println("CPF:");
                                long cpf = scanner.nextLong();
                                cliente.nome = nome;
                                cliente.cpf = cpf;
                            }

                            for (int j = 0; j < cliente.computadores.length; j++) {
                                if(cliente.computadores[j]==null) {
                                    cliente.computadores[j] = computador1;
                                    break;
                                }
                            }

                            i++;
                            break;
                        case 2:
                            //processo de compra PC2
                            if(cliente.nome == null){
                                System.out.println("Insira seus Dados:");
                                System.out.println("Nome: ");
                                String name = scanner.nextLine();
                                System.out.println("CPF:");
                                long cpfs = scanner.nextLong();
                                cliente.nome = name;
                                cliente.cpf = cpfs;
                            }
                            for (int j = 0; j < cliente.computadores.length; j++) {
                                if (cliente.computadores[j] == null) {
                                    cliente.computadores[j] = computador2;
                                    break;
                                }
                            }
                            break;

                        case 3:
                            //processo de compra PC3
                            if(cliente.nome == null){
                                System.out.println("Insira seus Dados:");
                                System.out.println("Nome: ");
                                String nomes = scanner.nextLine();
                                System.out.println("CPF:");
                                long cpfx = scanner.nextLong();
                                cliente.nome = nomes;
                                cliente.cpf = cpfx;
                            }

                            for (int j = 0; j < cliente.computadores.length; j++) {
                                if (cliente.computadores[j] == null) {
                                    cliente.computadores[j] = computador2;
                                    break;
                                }
                            }
                            break;

                        case 4:
                            voltar = true;
                            break;
                        case 5:
                            voltar = false;
                            break;
                    }
                    System.out.println();
                    boolean resp;
                    do {
                        scanner.nextLine();
                        System.out.println("Deseja fechar a sacola e finalizar o pedido? (S ou N)");
                        String answ = scanner.nextLine();

                        if (answ.equals("S")) {
                            System.out.println("Total: R$" + cliente.calculaTotalCompra());
                            System.out.println("Obrigada por comprar na PcMania!");
                            resp = true;
                            voltar = false;
                        } else if (answ.equals("N")) {
                            voltar = true;
                            resp = true;
                            System.out.println("Voltando para o menu...");
                        } else {
                            System.out.println("Insira uma resposta válida");
                            resp = false;
                        }
                    }while(!resp);

                }catch (Exception InputMismatchException){
                    System.out.println();
                    System.out.println("Insira uma resposta válida, voltando ao menu inicial...");
                    System.out.println();
                    voltar = true;
                }

            } else if(answer.equals("N")){
                voltar = true;
            }else{
                System.out.println("Insira uma resposta válida");
            }
        }

    }
}