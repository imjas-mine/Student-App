package com.jasmine.student_app;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    public List<Student> getStudents(){
        return List.of()
    }
}
