package com.example.student_app.services;

import com.example.student_app.dao.ClassRepository;
import com.example.student_app.models.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    final ClassRepository classRepository;

    @Autowired
    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getClasses(){
        return this.classRepository.findAll();
    }
}
