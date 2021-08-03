package com.example.student_app.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthday;

    public Student(String name, Integer age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
