package com.studentsubjectmark.studentmarks.controller;


import com.studentsubjectmark.studentmarks.model.StudentMarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.studentsubjectmark.studentmarks.service.StudentService;

import java.util.Map;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Set<Map.Entry<String, StudentMarks>> getAllStudentdetails() {
        return studentService.getAllStudentdetails();
    }

    @GetMapping("/students/{name}")
    public StudentMarks getDetailsOfOneStudent(@PathVariable(name ="name") String name){
        return studentService.getDetailsofOneStudent(name);
    }
}
