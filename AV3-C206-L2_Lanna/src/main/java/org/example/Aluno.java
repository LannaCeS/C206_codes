package org.example;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int matricula;
    private String curso;
    private float media;

    //construtor
    public Aluno(String nome, String curso, int matricula, float media){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.media = media;
    }

    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public float getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno aluno) {
        if(this.media<aluno.media){
            return -1;
        }else if (this.media>aluno.media){
            return 1;
        }else{
            return 0;
        }
    }
}
