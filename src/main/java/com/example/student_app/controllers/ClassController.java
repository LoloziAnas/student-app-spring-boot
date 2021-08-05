package com.example.student_app.controllers;

import com.example.student_app.models.Class;
import com.example.student_app.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/classes")
public class ClassController {
    final ClassService classService;

    @Autowired
    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @GetMapping
    public List<Class> getClasses(){
        return this.classService.getClasses();
    }
}
