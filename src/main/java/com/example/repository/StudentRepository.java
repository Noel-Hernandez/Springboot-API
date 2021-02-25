package com.example.repository;

import com.example.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SelectStudent", nativeQuery = true)
    List<Student> getAllStudents();


    @Query(value = "{ call SelectStudentById(:Student_id)}", nativeQuery = true)
    Student getStudentById(@Param("Student_id") Integer studentId);


    @Procedure(name = "Student.insertStudentSP")
    void insertStudentSP(@Param("Name") String name, @Param("Email") String email,
                         @Param("Password") String password, @Param("Age") int age, @Param("Nationality") int nationality,
                         @Param("Major") int major);


    @Procedure(name = "Student.updateStudentSP")
    void updateStudentSP(@Param("Student_id") Integer studentId, @Param("Name") String name,
                         @Param("Email") String email, @Param("Password") String password );


    @Procedure(name = "Student.deleteStudentSP")
    void deleteStudentSP(@Param("Student_id") int studentId);

}
