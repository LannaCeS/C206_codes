public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    public void usarArma(){
        arma.resistencia -=2;

    }

    public void tomarDano(){
        pontos -=5;
    }
}
