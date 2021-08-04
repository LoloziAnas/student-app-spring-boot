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
public class StudentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }


}
