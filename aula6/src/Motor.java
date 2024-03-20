import java.util.Random;

import static java.lang.Math.random;

public class Motor {

    String cilindradas;
    float velocidadeMaxima;

    Random rand = new Random();

    int num = rand.nextInt(130);
    void mostraInfo(){
        System.out.println("Cilindradas: "+cilindradas);
        System.out.println("Velocidade: "+(this.velocidadeMaxima-num));
    }
}
