package com.example.controller;
import com.example.demo.Client;


import com.example.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/client")
public class ClientController {



    @Autowired
    private ClientRepository service;

    @GetMapping("/clients")
    public List<Client> list() {
        return service.get();
    }

    @PostMapping("/add")
    public void add(@RequestBody Client client) {
        service.save(client);
    }


}
