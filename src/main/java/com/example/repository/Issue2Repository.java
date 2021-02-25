package com.example.repository;

import com.example.demo.Client;
import com.example.demo.Issue2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Calendar;
import java.util.List;

public interface Issue2Repository extends JpaRepository<Issue2, Integer> {

    @Query(value = "SelectIssues", nativeQuery = true)
    List<Issue2> getAllStudents();

    @Procedure(name = "Issue2.InsertIssue")
    void insertStudentSP(@Param("Description") String description, @Param("DataTime") Calendar dataTime, @Param("Address") String address, @Param("Phone") String phone,
                         @Param("Email") String email, @Param("ReportStatus") String reportStatus,@Param("Id") int id,@Param("IdS") int idS
                         );


}
