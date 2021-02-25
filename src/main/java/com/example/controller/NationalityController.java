package com.example.controller;

import com.example.demo.Nationality;
import com.example.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/nationality")
public class NationalityController {

    @Autowired
    private NationalityService service;

    @GetMapping("/nationalities")
    public List<Nationality> list() {
        return service.listAll();
    }
}
