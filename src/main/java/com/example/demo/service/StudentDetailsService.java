package com.example.demo.service;

import com.example.demo.pojo.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentDetailsService {

    @Autowired //field injection
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    public String delete(int id){
        studentRepository.deleteById(id);
        return Integer.toString(id);
    }


    public Student getStudentById(int id) {
        return studentRepository.getReferenceById(id);
    }
    public Student addStudent(Student student){
        return studentRepository.save(student); //change
    }
}
