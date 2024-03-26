package br.inatel.cdg;

public class Cliente {
    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public long getCpf(){
        return this.cpf;
    }
}
