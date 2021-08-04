package com.example.student_app.services;

import com.example.student_app.dao.StudentRepository;
import com.example.student_app.models.Student;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        this.studentRepository.save(student);
    }
    public void deleteStudent(Long studentID){
        boolean exists = studentRepository.existsById(studentID);
        if (!exists) throw new IllegalStateException("Student ID "+studentID+" doesn't exists");
        this.studentRepository.deleteById(studentID);
    }
}
