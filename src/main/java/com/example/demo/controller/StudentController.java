package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stud")
public class StudentController {

    @Autowired
    private StudentDetailsService studentDetailsService;


    @GetMapping("/all-students")
    public List<Student> getAllStrudents(){
        System.out.println("My commit645576");
        return studentDetailsService.getStudents();
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id){
        return studentDetailsService.delete(id);
    }

    @GetMapping("/student-by-id")
    public Student getStudentById(@RequestParam(name = "id", required = true) int id){
        return studentDetailsService.getStudentById(id);
    }
    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student){
        return studentDetailsService.addStudent(student);
    }


}
