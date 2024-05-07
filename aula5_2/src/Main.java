import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       //Exceções e Controle de Erros
        //stacktrace -> rastro da pilha de execução (onde está a exceção -> classe e linha)
        //mesmo após o try catch, o código continua o que estava fazendo de onde parou
        //try catch trata o erro, não soluciona; não deixa o código crashar
        //tratando no método 1, não mostra a última string, já que encontrando o erro, saiu do try na mesma hora
        //ArithmeticException -> divide by zero -> exceção unchecked -> o java não checa antes, permitindo que divida por 0 -> poderia ser tratada com if-else
        //NullPointerException é unchecked
        //corrigir na raiz do problema


        HashSet<Cliente> clienteHashSet = new HashSet<Cliente>();

        Cliente cliente1 = new Cliente("Lanna");
        Cliente cliente2 = new Cliente("Túlio");
        Cliente cliente3 = null;



        try {
            cliente1.insereCliente(clienteHashSet, cliente1);
            cliente2.insereCliente(clienteHashSet, cliente2);
            cliente3.insereCliente(clienteHashSet, cliente3);
        }catch(NullPointerException e){
            System.out.println("Não foi possível inserir");
        }


        try{
            cliente1.infos(clienteHashSet);
            cliente2.infos(clienteHashSet);
            cliente3.infos(clienteHashSet);
        }catch (NullPointerException e){
            System.out.println("Cliente inválido");
        }


        System.out.println("Executado!");
    }
}