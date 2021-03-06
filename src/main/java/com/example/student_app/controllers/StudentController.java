package com.example.student_app.controllers;

import com.example.student_app.models.Student;
import com.example.student_app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping(path = "{studentID}")
    public Student getStudentById(@PathVariable("studentID") Long studentID){
        return studentService.getStudentById(studentID);
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path ="{studentID}" )
    public void deleteStudent(@PathVariable("studentID") Long studentID){
        studentService.deleteStudent(studentID);
    }
    @PutMapping(path = "{studentID}")
    public void updateStudent(@PathVariable("studentID") Long studentID,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email ){

        studentService.updateStudent(studentID, name, email);
    }
}
