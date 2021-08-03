package com.example.student_app;

import com.example.student_app.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

    @GetMapping
    public List<Student> hello(){
        ArrayList<Student> students = new ArrayList<>();
        students.add( new Student("Anas", "anas@gmail.com", LocalDate.of(2000,4,4), 44));
        return students;
    }
}
