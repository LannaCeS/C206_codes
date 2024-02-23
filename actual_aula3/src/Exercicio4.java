import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra a sala correta para o curso de C206/C06!");
        System.out.println("Insira o numero de alunos cursando C206/C06: ");
        int num_alunos = scan.nextInt();

        switch (num_alunos) {
            case 10, 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Insira o numero correto de alunos: ");
                num_alunos = scan.nextInt();
                switch (num_alunos) {
                    case 10, 20:
                        System.out.println("Sala I-16");
                        break;
                    case 30:
                        System.out.println("Sala I-22");
                        break;
                    default:
                        System.out.println("Reinicie o programa e tente novamente");
                        break;
                }
        }
    }
}
