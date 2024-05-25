package br.inatel.exceptions;

public class NuloException extends RuntimeException{
    //Unchecked Exception

    //Construtor
    public NuloException(String mensagem){
        super(mensagem);
    }
}
