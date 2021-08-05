package com.example.student_app.configs;

import com.example.student_app.dao.ClassRepository;
import com.example.student_app.dao.StudentRepository;
import com.example.student_app.models.Student;
import com.example.student_app.models.Class;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository, ClassRepository classRepository){
        return args -> {


            Class sim = new Class("Master Intelligent and Mobile","SIM" );
            Class aob = new Class("Antology Optique Bidiology ","AOB" );
            classRepository.save(sim);
            classRepository.save(aob);
            Student anas_lolozi = new Student("Anas LOLOZI","anas@gmail.com", LocalDate.of(1997,4,5),sim);
            Student achraf_errabaoui = new Student("Achraf ERRABAOUI","achraf@gmail.com", LocalDate.of(1998,8,15),aob);

            studentRepository.save(anas_lolozi);
            studentRepository.save(achraf_errabaoui);
        };
    }
}
