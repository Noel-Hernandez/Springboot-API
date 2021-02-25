package com.example.repository;

import com.example.demo.Major;
import com.example.demo.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MajorRepository extends JpaRepository<Major, Integer> {


}