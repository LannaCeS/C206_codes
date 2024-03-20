public class Main {
    public static void main(String[] args) {

        //objeto todo
        Personagem persona1 = new Personagem();
        persona1.nome = "Persona";

        //objeto parte
        Arma arma1 = new Arma();
        arma1.nome = "Blade";

        persona1.arma = arma1; //agregar a arma ao personagem

        persona1.usarArmas();
    }
}