package org.example;

public class Empresa {

    String nome;

    //array de produtos
    Produto []produtos = new Produto[10];

    public Empresa(String nome){

        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome da empresa: " + this.nome);

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] != null)
                produtos[i].mostraInfo();
        }
    }

    public void adicionaProduto(Produto produto){
        for (int i = 0; i < produtos.length; i++){
            if(produtos[i] == null) {
                produtos[i] = produto;
                break;
            }
        }
    }
}
