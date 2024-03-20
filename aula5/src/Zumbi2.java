public class Zumbi2 {
    double vida;
    String nome;

    public double mostraVida(){
        return vida;
    }
    public boolean transfereVida(Zumbi2 zumbiAlvo, double quantia){
        if (quantia<vida){
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            System.out.println("Fazendo a transferencia...");
            return true;
        }else{
            System.out.println("Não é possível transferir o mesmo tanto ou mais vida do que se tem!");
            return false;
        }
    }
}
