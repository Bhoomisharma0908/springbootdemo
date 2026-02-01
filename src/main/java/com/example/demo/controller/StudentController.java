package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class StudentController {

    @Autowired
    private StudentDetailsService studentDetailsService;


    @GetMapping("/all-students")
    public List<Student> getAllStrudents(){
        System.out.println("My commit64556");
        return studentDetailsService.getStudents();
    }

    @GetMapping("/student-by-id")
    public Student getStudentById(@RequestParam(name = "id", required = true) int id){
        return studentDetailsService.getStudentById(id);
    }

}
