package br.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    Cliente [] clientes;


    Conta(float saldo, float limite, Cliente[] clientex){
        clientes = new Cliente[3];
        clientes = clientex;
        this.saldo = saldo;
        this.limite = limite;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setNumero(int numero){

        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public float getLimite(){
        return this.limite;
    }

    public void sacar (float quantia){
        if(this.saldo >= quantia){
            System.out.println("Saque de R$"+quantia+" efetuado!");
            this.saldo-=quantia;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(float quantia){
        this.saldo+=quantia;
        System.out.println("Depósito de R$"+quantia+" realizado!");

    }
}
