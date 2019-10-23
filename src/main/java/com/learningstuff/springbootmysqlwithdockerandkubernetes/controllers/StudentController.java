package com.learningstuff.springbootmysqlwithdockerandkubernetes.controllers;

import com.learningstuff.springbootmysqlwithdockerandkubernetes.models.Student;
import com.learningstuff.springbootmysqlwithdockerandkubernetes.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৯/১০/১৯
 * Time: ৮:৩৮ AM
 **/

@RestController
@RequestMapping(value = "/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping(value = "")
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity.ok().body(studentRepository.findAll());
    }

    @GetMapping(value = "/{studentId}")
    public ResponseEntity<?> getStudentById(@PathVariable(value = "studentId") long studentId) {

        Optional<Student> optionalStudent = studentRepository.findById(studentId);

        if (optionalStudent.isPresent()) {
            return ResponseEntity.ok(optionalStudent.get());
        }

        return ResponseEntity.badRequest().body("Student not found by " + studentId);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {

        try {
            Student saveStudent = studentRepository.save(student);
            return ResponseEntity.ok(saveStudent);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to save student.");
        }
    }
}
