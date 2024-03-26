public class Main {
    public static void main(String[] args) {
        //Modificadores de acesso

        //public (+)-> todos acessam
        //private (-)-> só acessa dentro da classe, ou usa getter e setter -> privar atributos
        //default -> público dentro do pacote, fora é private

        //getter e setter -> métodos públicos (ex.: getSaldo, setSaldo)

        //Vantagens -> acesso indireto, mantendo o mesmo (controle)

        Conta conta = new Conta();
        conta.setSaldo(10000);
        System.out.println(conta.getSaldo());
    }
}