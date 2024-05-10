public class Main {
    public static void main(String[] args) {
        //hashset -> nulos primeiro
        //checked exceptions: exceptions no tempo de compilação, ou seja, na escrita do código -> a IDE aponta o erro
        //Runtime Exception: erro após a execução do código, no "runtime" -> unchecked exceptions são um tipo de runtime exception
        //tempo de compilação: antes de executar o código (durante a escrita) -> aponta o erro
        //e.printStackTrace() -> printar o rastro da pilha, não só o nome da exceção
        //checked exceptions têm sugestões de tratamento dadas pela IDE
        //throws Exception: tratamento de exceção na assinatura do método onde está; "Quem chama esse método TEM QUE TRATAR esse erro (usar o try catch)" -> delega a função
        //throws só utilizado em checked
        //mesmo que faça um if-else de checagem, obrigatoriamente tem de fazer o tratamento para checked exceptions
        //throw new exception -> lança nova exceção -> sout nesse nome de exceção (classe) -> gera a exceção e o stackTrace
        // SaldoInsuficienteException extends RuntimeException -> + construtor com super(message)
        //throw new SaldoInsuficienteException("Saldo Insuficiente");
        //se extends de Exception, é referente a uma exceção checked
        //multiplas exceptions: catch{}catch{}... OU catch(Ex1 ex1 | Ex2 ex2)
        //ex2.getMessage();
    }
}