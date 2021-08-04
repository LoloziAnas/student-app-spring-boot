package com.example.student_app.configs;

import com.example.student_app.dao.StudentRepository;
import com.example.student_app.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student anas_lolozi = new Student("Anas LOLOZI","anas@gmail.com", LocalDate.of(1997,4,5), 15);
            Student achraf_errabaoui = new Student("Achraf ERRABAOUI","achraf@gmail.com", LocalDate.of(1998,8,15), 25);

            studentRepository.save(anas_lolozi);
            studentRepository.save(achraf_errabaoui);
        };
    }
}
