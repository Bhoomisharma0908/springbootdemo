package com.example.demo.repository;

import com.example.demo.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;//change

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
