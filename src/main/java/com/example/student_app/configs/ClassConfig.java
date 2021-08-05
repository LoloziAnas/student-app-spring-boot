package com.example.student_app.configs;

import com.example.student_app.dao.ClassRepository;
import com.example.student_app.models.Class;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassConfig {
/*    @Bean
    CommandLineRunner commandLineRunner(ClassRepository classRepository){
        return args -> {
            Class sim = new Class("Master Intelligent and Mobile","SIM" );
            Class aob = new Class("Antology Optique Bidiology ","AOB" );
            classRepository.save(sim);
            classRepository.save(aob);
        };
    }*/
}
