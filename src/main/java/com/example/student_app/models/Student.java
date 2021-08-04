package com.example.student_app.models;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@ToString @Getter @Setter
@Table @Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private LocalDate birthday;
    private Integer age;

    public Student(String name, String email, LocalDate birthday, Integer age) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.age = age;
    }
}
