package com.example.student_app.services;

import com.example.student_app.dao.StudentRepository;
import com.example.student_app.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {
    final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public void addNewStudent(Student student){
        this.studentRepository.save(student);
    }
}
