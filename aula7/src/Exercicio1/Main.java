package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aux = 0;
        //posição random para a bomba
        Random rand = new Random();
        int posX = rand.nextInt(2);
        int posY = rand.nextInt(2);

        //matriz do campo minado
        Boolean [][] campo = new Boolean[2][2];
        campo [0][0] = false;
        campo[0][1] = false;
        campo[1][0] = false;
        campo[1][1] = false;

        //instalando a bomba
        campo[posX][posY] = true;
        System.out.println(posX +"-"+ posY);

        //Scanner para entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("~~ Campo Minado ~~");

        do{
            System.out.println("Para qual posição quer ir? Insira no modelo 'X-Y'");
            try {
                String[] posjogador = scanner.nextLine().split("-");
                int posjogX = Integer.parseInt(posjogador[0]);
                int posjogY = Integer.parseInt(posjogador[1]);

                if (campo[posjogX][posjogY]) {
                    System.out.println("BOOM!");
                } else {
                    System.out.println("Área limpa");
                }
            }catch(Exception ArrayIndexOutofBoundsException){
                System.out.println("Insira uma posição válida");
            }
            aux++;
        }while(aux < (campo.length * 2));

        System.out.println("~~ Fim ~~");


    }
}
