import java.util.Random;
import java.util.Scanner;

public class Exercicio5_6 {
    public static void main(String[] args) {
        int num; //número a ser adivinhado
        Random rand = new Random();
        int advinha;

        num = rand.nextInt(10) + 1;
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos jogar? Advinhe o numero que estou pensando: ");
        try {
            advinha = scanner.nextInt();
            while(num!=advinha) {
                if(num>advinha) {
                    System.out.println("Tente um numero maior: ");

                }else{
                    System.out.println("Tente um numero menor: ");
                }
                advinha = scanner.nextInt();
            }
            System.out.println("Parabens, voce acertou!!");
        } catch (Exception InputMismatchException) {
            System.out.println("Digite um numero valido da proxima vez!");
        }
    }
}
