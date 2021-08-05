package com.example.student_app.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@ToString @Getter @Setter
@Table @Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100)
    private String email;
    private LocalDate birthday;
    @Transient
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "class")
    private Class aClass;

    public Student(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public Student(String name, String email, LocalDate birthday,  Class aClass) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.age = age;
        this.aClass = aClass;
    }



    public Integer getAge() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }
}
