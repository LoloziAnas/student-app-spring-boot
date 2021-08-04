package com.example.student_app.services;

import com.example.student_app.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        students.add( new Student("Anas", "anas@gmail.com", LocalDate.of(2000,4,4), 44));
        return students;
    }
}
