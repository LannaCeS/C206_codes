package org.example;

public class Serie {
    //Classe todo

    //Atributos
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;

    Diretor diretor;
    Plataforma plataforma;


    //Métodos
    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomeDiretor){
        //composição entre a série e o diretor
        this.diretor = new Diretor(nomeDiretor);
        this.nome = nome;
        this.finalizada = finalizada;
        this.nota = nota;
        this.temporadas = temporadas;
    }
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Temporadas: "+this.temporadas);
        System.out.println("Finalizada?: "+this.finalizada);
        System.out.println("Nota: "+this.nota);
        System.out.println("Diretor: "+this.diretor.nome);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
