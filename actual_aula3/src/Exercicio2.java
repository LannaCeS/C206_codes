import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Insira em sequencia os valores dos lanches: ");

        int lanche1 = scan.nextInt();
        int lanche2 = scan.nextInt();
        int lanche3 = scan.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3.0f;

        System.out.println("Total: "+total);
        System.out.println("Media: "+media);

        scan.close();
    }
}