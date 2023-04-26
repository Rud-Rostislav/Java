package com.ua.robot_dreams.homework_10;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int course;
    private final int age;
    private final String gender;
    private final String faculty;

    public Student(String firstName, String lastName, int course, int age, String gender, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
    }

    public void learning() {
        System.out.println("Student " + firstName + " " + lastName + " is learning.");
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", course = " + course +
                ", \nage = " + age +
                ", gender = '" + gender + '\'' +
                ", faculty = '" + faculty + '\'' +
                '}';
    }
}