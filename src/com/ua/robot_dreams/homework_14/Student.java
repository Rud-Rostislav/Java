package com.ua.robot_dreams.homework_14;

public class Student extends Human {
    private final String studentId;
    private final String studentName;
    private final String studentEmail;
    private final String studentPhone;

    public Student(String firstName, String lastName, int age, String gender, String studentId, String studentName, String studentEmail, String studentPhone) {
        super(firstName, lastName, age, gender);
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
    }

    @Override
    public void getInfo() {
        System.out.println("Student created.");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Student Email: " + getStudentEmail());
        System.out.println("Student Phone: " + getStudentPhone());
        System.out.println();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }
}