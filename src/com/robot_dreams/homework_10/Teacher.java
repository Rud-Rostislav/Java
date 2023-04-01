package com.robot_dreams.homework_10;

public class Teacher {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String scientificDegree;

    public Teacher(String firstName, String lastName, int age, String gender, String scientificDegree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.scientificDegree = scientificDegree;
    }

    public void teaching() {
        System.out.println("Teacher " + firstName + " " + lastName + " is teaching.");
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", \ngender = '" + gender + '\'' +
                ", scientificDegree = '" + scientificDegree + '\'' +
                '}';
    }
}