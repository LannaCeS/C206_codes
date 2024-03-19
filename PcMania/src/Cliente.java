public class Cliente {
    String nome;
    long cpf;

    Computador [] computadores = new Computador[4];

    public Cliente(String nome, Long cpf, Computador computer){
        this.nome = nome;
        this.cpf = cpf;

        for(int i = 0; i< computadores.length; i++){
            if(computadores[i] == null) {
                this.computadores[i] = computer;
                System.out.println(computadores[i].preco);
                break;
            }
        }
    }
    public Cliente(){

    }
    public float calculaTotalCompra(){
        double preco = 0;

        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] != null)
                preco += computadores[i].preco;
        }
        return (float)preco;
    }
}
