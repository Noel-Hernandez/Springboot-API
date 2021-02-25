package com.example.repository;

import com.example.demo.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Procedure(name = "Client.SelectClients")
    List<Client> get();



    @Procedure(name = "Client.InsertClient")
    void insertClient(@Param("Name") String name, @Param("Email") String email, @Param("Password") String password,
                      @Param("Address") String address, @Param("Phone") String phone, @Param("Contact") String contact);




}
