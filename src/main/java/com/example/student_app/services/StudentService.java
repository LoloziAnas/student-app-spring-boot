package com.example.student_app.services;

import com.example.student_app.dao.StudentRepository;
import com.example.student_app.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long studentID){
        Optional<Student> student = studentRepository.findStudentById(studentID);
        if (!student.isPresent())
            throw new IllegalStateException("Student id "+studentID+" doesn't exists");
        return student.get();
    }
    public void addNewStudent(Student student){
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        this.studentRepository.save(student);
    }
    public void deleteStudent(Long studentID){
        boolean exists = studentRepository.existsById(studentID);
        if (!exists) throw new IllegalStateException("Student ID "+studentID+" doesn't exists");
        this.studentRepository.deleteById(studentID);
    }
    @Transactional
    public void updateStudent(Long studentID, String name, String email){
        Student student = studentRepository.findById(studentID)
                .orElseThrow(() -> new IllegalStateException("Student id doesn't exists"));
        if (name != null && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }
        if (email != null && !Objects.equals(student.getEmail(), email)){
            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);
            if (optionalStudent.isPresent())
                throw new IllegalStateException("email taken");
            student.setEmail(email);
        }

    }
}
