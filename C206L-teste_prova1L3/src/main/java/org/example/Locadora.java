package org.example;

public class Locadora {
    //Atributos
    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar;

    //Array de carros
    Carro [] carros = new Carro[10];

    //Métodos

    //construtor
    public Locadora(String nome, String CNPJ, String endereco){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }
    public void mostraInfo(){
        System.out.println("~~ Informações da locadora ~~");
        System.out.println("Nome: "+this.nome);
        System.out.println("CNPJ: "+this.CNPJ);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Número de carros disponíveis: "+this.carrosParaAlugar);
        System.out.println("Carros: ");

        for(int i = 0; i < carros.length; i++){
            if(carros == null){
                System.out.println("0");
            }
            if(carros[i] !=null){
                carros[i].mostraInfo();
            }
        }

    }
    public void adicionarCarro(Carro carro){
        for (int i = 0; i < carros.length; i++) {
            if(carros[i] == null){
                carros[i] = carro;
                break;
            }
        }

    }
    public void alugarCarro(int index){
        for(int i = 0; i< carros.length; i++){
            if(i == index){
                carros[i].alugado = true;
                System.out.println("Carro alugado!");
                break;
            }
        }
    }
    public float contarCarrosParaAlugar(){
        int aluga = 0;
        int quant = 0;
        for(Carro car : carros){
            if(car!= null){
                if(!car.alugado){
                    //se o carro não está alugado
                    aluga++;
                }
                quant++;
            }
        }
        return ((float) aluga/(float) quant) * 100;
    }
}
