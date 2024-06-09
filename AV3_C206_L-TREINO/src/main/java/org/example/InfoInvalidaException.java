package org.example;

public class InfoInvalidaException extends RuntimeException{
    public InfoInvalidaException (String mensagem){
        super(mensagem);
    }
}
