import java.util.HashSet;

public class Cliente {
    String nome;
    Conta conta;


    public Cliente(String nome){
        this.nome = nome;
        conta = new Conta(900, 1100);
    }

    public void insereCliente(HashSet<Cliente> clienteHashSet, Cliente cliente){
        try {
            clienteHashSet.add(cliente);
        }catch(NullPointerException e){
            System.out.println("Não foi possível inserir esse cliente");
        }
    }

    public void infos(HashSet<Cliente> clienteHashSet){
        this.conta.mostraInfo(clienteHashSet);
    }
}
