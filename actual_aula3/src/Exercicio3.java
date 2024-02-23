import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a nota da NPA: ");
        int npa = scan.nextInt();

        while (npa > 100 || npa < 0) {
            System.out.println("Insira uma nota de Np2 valida: ");
            npa = scan.nextInt();
        }
        if (npa >= 60) {
            System.out.println("Aprovado!");
        } else if (npa >= 30 && npa < 60) {
            System.out.println("Insira a nota da NP3: ");
            int np3 = scan.nextInt();
            while(np3>100 || np3<0){
                System.out.println("Insira uma nota de NP3 valida: ");
                np3 = scan.nextInt();
            }
            if (((np3 + npa) / 2) >= 50) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Reprovado");
            scan.close();
        }
    }
}
