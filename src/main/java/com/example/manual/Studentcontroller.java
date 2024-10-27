package com.example.manual;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Abhi", 100),
            new Student(2, "Sandy", 99)
    ));

    @GetMapping("/Student")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/Student")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
  
}
