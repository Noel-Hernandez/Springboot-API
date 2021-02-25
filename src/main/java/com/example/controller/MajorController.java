package com.example.controller;

import com.example.demo.Major;
import com.example.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/major")
public class MajorController {

    @Autowired
    private MajorService service;

    @GetMapping("/majors")
    public List<Major> list() {
        return service.listAll();
    }
}
