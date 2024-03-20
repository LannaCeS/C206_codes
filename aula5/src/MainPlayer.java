public class MainPlayer {
    public static void main(String[] args) {

        //Instâncias
        Personagem persona1 = new Personagem();
        persona1.nome = "Elliot";
        persona1.pontos = 100;

        Arma weapon = new Arma();
        weapon.resistencia = 500;
        weapon.nome = "Blade";
        weapon.descricao = "Uma antiga arma poderosa que detém inimigos rapidamente";
        weapon.poder = 700;

        //Agregação
        persona1.arma = weapon;

        //Mostrando as infos da arma
        System.out.println("~~Arma~~");
        persona1.arma.mostraInfoArma();
        System.out.println("----------------------------------------");

        //Mostrando as infos do personagem
        System.out.println("~~Pesonagem~~");
        System.out.println("Nome: "+persona1.nome);
        System.out.println("Vida: "+persona1.pontos);
        System.out.println("---------------------------------------");

        //Ações
        System.out.println("Ataque!");
        persona1.usarArma();
        System.out.println("Nova resistência da arma: "+persona1.arma.resistencia);
        System.out.println();
        System.out.println("Ouch! Dano tomado");
        persona1.tomarDano();
        System.out.println("Vida: "+persona1.pontos);
        System.out.println("-------------------------------------");

        //Novas infos da arma
        System.out.println("Novas infos da arma: ");
        persona1.arma.mostraInfoArma();
        System.out.println("-------------------------------------");
        System.out.println("Novas infos do personagem: ");
        System.out.println("Nome: "+persona1.nome);
        System.out.println("Vida: "+persona1.pontos);

    }
}
