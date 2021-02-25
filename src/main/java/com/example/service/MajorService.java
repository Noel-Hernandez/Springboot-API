package com.example.service;

import com.example.demo.Major;
import com.example.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class MajorService {

    @Autowired
    private MajorRepository repository;

    public List<Major> listAll() {

        return repository.findAll();

    }

    public void save(Major major) {

        repository.save(major);
    }

    public Major get(int id) {

        return repository.findById(id).get();
    }

    public void delete(int id) {

        repository.deleteById(id);
    }

}
