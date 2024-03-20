public class Main6 {
    public static void main(String[] args) {

        //objeto todo
        Kart firstkart = new Kart();
        Kart secondkart = new Kart();


        //objeto parte 1 (Agregação)
        Piloto firstpilot = new Piloto();
        firstpilot.nome = "Wario";
        firstpilot.vilao = true;

        Piloto secondpilot = new Piloto();
        secondpilot.nome = "Luigi";
        secondpilot.vilao = false;

        //agregar
        firstkart.pilot = firstpilot;
        secondkart.pilot = secondpilot;

        firstkart.nome = "Playball";
        secondkart.nome = "Winner";
        firstkart.motor1.velocidadeMaxima = 150;
        secondkart.motor1.velocidadeMaxima = 150;
        firstkart.motor1.cilindradas = "1000";
        secondkart.motor1.cilindradas = "1100";

        firstkart.pular();
        firstkart.soltarTurbo();
        secondkart.fazerDrift();
        secondkart.pular();
        firstkart.soltarTurbo();

        firstkart.motor1.mostraInfo();
        secondkart.motor1.mostraInfo();

    }
}
