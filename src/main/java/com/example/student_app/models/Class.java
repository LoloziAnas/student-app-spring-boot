package com.example.student_app.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor @AllArgsConstructor
@ToString @Setter @Getter
@Entity @Table
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100)
    private String name;
    @Column(length = 5)
    private String abbr; // for Class abbreviation


    public Class(String name, String abbr) {
        this.id = id;
        this.name = name;
        this.abbr = abbr;
    }
}
