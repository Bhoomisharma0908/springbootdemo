package com.example.demo.service;

import com.example.demo.pojo.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    public Student getStudentById(int id) {
        return studentRepository.getReferenceById(id);
    }
}
