package com.example.repository;

import com.example.demo.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NationalityRepository extends JpaRepository<Nationality, Integer> {


}

