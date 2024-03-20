public class Personagem {

    String nome;
    int pontos;
    Arma arma;



    void usarArmas() {

        arma.resistencia -=2;
        System.out.println("Resistencia = "+arma.resistencia);
    }

    void tomarDano(){
        pontos -=5;
    }
}
