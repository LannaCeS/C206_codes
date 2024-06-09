package org.example;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private String tipo;

    public Produto (String nome, double preco, String tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public Produto(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Produto o) {
        if(this.preco<o.preco){
            return -1;
        }else if (this.preco>o.preco){
            return 1;
        }else{
            return 0;
        }
    }
}
