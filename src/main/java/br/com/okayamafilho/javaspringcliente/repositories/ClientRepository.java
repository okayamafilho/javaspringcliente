package br.com.okayamafilho.javaspringcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import  br.com.okayamafilho.javaspringcliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
