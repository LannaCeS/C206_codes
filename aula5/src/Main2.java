import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Instanciar
        Zumbi2 zumbi2 = new Zumbi2();
        zumbi2.nome = "Dan";
        zumbi2.vida = 100;

        Zumbi2 zumbi3 = new Zumbi2();
        zumbi3.nome = "Ben";
        zumbi3.vida = 200;

        System.out.println("Zumbi 2: "+zumbi2.mostraVida());
        System.out.println("Zumbi 3: "+zumbi3.mostraVida());

        System.out.println("Quanto deseja transferir do zumbi 2 para o zumbi 3?");
        double quant = scanner.nextDouble();

        if(zumbi2.transfereVida(zumbi3, quant)){
            System.out.println();
            System.out.println("Zumbi 2: "+zumbi2.mostraVida()+" xp");
            System.out.println("Zumbi 3: "+zumbi3.mostraVida()+" xp");
        }

        System.out.println("----------------------------------------------");
        System.out.println();

        zumbi3.vida = 300;
        System.out.println("Alterando a vida do Zumbi 3 para 300...");
        System.out.println();
        System.out.println("Igualando as vidas...");
        zumbi2 = zumbi3;



        System.out.println("Zumbi 2: "+zumbi2.mostraVida()+" xp");
        System.out.println("Zumbi 3: "+zumbi3.mostraVida()+" xp");

    }
}
