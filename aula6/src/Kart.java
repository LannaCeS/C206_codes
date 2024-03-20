public class Kart {
    String nome;
    Piloto pilot;
    Motor motor1;

    public Kart(){
        motor1 = new Motor();
    }


    void pular(){
        System.out.println("Pulo");
    }
    void soltarTurbo(){
        System.out.println("Turbo ativado!");
    }
    void fazerDrift(){
        System.out.println("Drifting...");
    }
}
