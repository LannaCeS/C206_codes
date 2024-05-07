import java.util.HashSet;

public class Conta {


    float saldo, limite;



    public Conta(float saldo, float limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public void mostraInfo(HashSet<Cliente> clienteHashSet){

        for(Cliente cliente:clienteHashSet){
            try {
                System.out.println("Nome: " + cliente.nome);
                System.out.println("Saldo: " + cliente.conta.saldo);
                System.out.println("Limite: " + cliente.conta.limite);
            }catch(NullPointerException e){
                //System.out.println("Conta inválida");
            }
        }

    }
}
