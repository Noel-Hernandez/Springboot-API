package com.example.service;

import com.example.demo.Nationality;
import com.example.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class NationalityService {

    @Autowired
    private NationalityRepository repository;

    public List<Nationality> listAll() {

        return repository.findAll();

    }

    public void save(Nationality student) {

        repository.save(student);
    }

    public Nationality get(int id) {

        return repository.findById(id).get();
    }

    public void delete(int id) {

        repository.deleteById(id);
    }

}
