package com.jasmine.student_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;
    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){

        Student s = new Student();
        s.setName("Jasmine");
        s.SetAge(22);

        repo.save(s);
    }
}
