package br.com.passos.estacionamento.service.exception;

public class DataInvalidaException extends RuntimeException{

    public DataInvalidaException(String message){
        super(message);
    }
    
}
