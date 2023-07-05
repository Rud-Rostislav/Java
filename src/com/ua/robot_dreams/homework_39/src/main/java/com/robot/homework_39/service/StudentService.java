package com.robot.homework_39.service;

import com.robot.homework_39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "John", 20));
        students.add(new Student(2, "Jane", 21));
        students.add(new Student(3, "Jack", 22));

        return students;
    }
}