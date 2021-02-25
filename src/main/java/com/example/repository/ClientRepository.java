package com.example.repository;

import com.example.demo.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query(value = "SelectClients", nativeQuery = true)
    List<Client> getAllStudents();

    @Procedure(name = "Client.InsertClient")
    void insertStudentSP(@Param("Name") String description, @Param("Address") String address,@Param("Password") String password,
                         @Param("Phone") String phone,@Param("Contact") String contact,
                         @Param("Email") String Email);




}
