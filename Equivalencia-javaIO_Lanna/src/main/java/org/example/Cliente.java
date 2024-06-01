package org.example;

public class Cliente implements Comparable<Cliente>{
    private String nome;
    private String CPF;
    private String endereco;
    private int idade;

    public Cliente(String nome, String CPF, String endereco, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.idade = idade;
    }

    public Cliente(){}

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Cliente o) {
        //sort por ordem alfabética
        //comparar o ASCII da primeira letra, se igual, pegar a segunda e assim por diante
        int ret = 0;
        int base;

        if(this.nome.length()>o.nome.length()) {
            base = o.nome.length();
        }else{
            base = this.nome.length();
        }

        for (int i = 0; i < base; i++) {
            int ascii = o.nome.charAt(i);

            if (ascii > this.nome.charAt(i)) {
                ret = -1;
                break;
            } else if (ascii < this.nome.charAt(i)) {
                ret = 1;
                break;
            }
        }
        return ret;
    }
}
