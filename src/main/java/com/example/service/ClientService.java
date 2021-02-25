package com.example.service;

import com.example.demo.Client;
import com.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientService {

    @Autowired
    private ClientRepository repository;


    public List<Client> listAll() {

        return repository.findAll();

    }

    public void save(Client client) {

        repository.save(client);
    }

    public Client get(int id) {

        return repository.findById(id).get();
    }

    public void delete(int id) {

        repository.deleteById(id);
    }

}



