package br.com.okayamafilho.javaspringcliente.service.exceptions;

public class DatabaseException extends RuntimeException { 

    public DatabaseException(String msg) {
        super(msg);
    }
}