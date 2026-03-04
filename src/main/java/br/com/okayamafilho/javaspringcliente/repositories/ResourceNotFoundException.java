package br.com.okayamafilho.javaspringcliente.repositories;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
