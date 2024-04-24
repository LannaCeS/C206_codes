package org.example;

public class MedicoMilitar extends Soldado implements Curar{
    //subclasse

    //Atributos
    private int anosEsperiencia;
    private int capacidadeEmergencia;

    //Métodos
    //Construtor
    public MedicoMilitar(String nome, long cpf, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void mostraInfo(){
        if(this.itemEspecial!=null){
            this.capacidadeEmergencia += 100;
        }
        super.mostraInfo();
        System.out.println("Anos de experiência: "+ this.anosEsperiencia);
        System.out.println("Capacidade de Emergência: "+ this.capacidadeEmergencia);
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void usandoItem(){
        if(this.itemEspecial != null) {
            System.out.println(this.getNome() + " utilizando item especial");
        }else{
            System.out.println(this.getNome() + " não tem item especial para utilizar");
        }
    }

    //Interface
    @Override
    public void curar(){
        if(this.capacidadeEmergencia > 920){
            System.out.println(this.getNome()+ " curou");
        }else{
            System.out.println(this.getNome() + " não curou");
        }
    }
}
