package com.example.controller;

import com.example.demo.Client;
import com.example.demo.Issue2;
import com.example.repository.ClientRepository;
import com.example.repository.Issue2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/issue")
public class Issue2Controller {



    @Autowired
    private Issue2Repository service;

    @GetMapping("/issues")
    public List<Issue2> list() {
        return service.getAllStudents();
    }

    @PostMapping("/adding")
    public void add(@RequestBody Issue2 issue) {
        service.save(issue);
    }

}
