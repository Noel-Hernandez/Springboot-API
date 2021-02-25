package com.example.service;

import com.example.demo.Client;
import com.example.demo.Issue2;
import com.example.repository.ClientRepository;
import com.example.repository.Issue2Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Issue2Service {

    @Autowired
    private Issue2Repository repository;


    public List<Issue2> listAll() {

        return repository.findAll();

    }

    public void save(Issue2 issue) {

        repository.save(issue);
    }

    public Issue2 get(int id) {

        return repository.findById(id).get();
    }

    public void delete(int id) {

        repository.deleteById(id);
    }

}
