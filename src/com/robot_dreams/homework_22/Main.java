package com.robot_dreams.homework_22;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 4.5));
        students.add(new Student("Petrov", 3.2));
        students.add(new Student("Sidorov", 2.8));
        students.add(new Student("Kozlov", 3.8));
        students.add(new Student("Smirnov", 4.0));

        Student.printStudents(students);
        Student.sortByName(students);
        Student.sortByAverage(students);
    }
}
