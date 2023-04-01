package com.robot_dreams.homework_14;

public class Teacher extends Human {
    private final String teacherId;
    private final String teacherName;
    private final String teacherEmail;
    private final String teacherPhone;

    public Teacher(String firstName, String lastName, int age, String gender, String teacherId, String teacherName, String teacherEmail, String teacherPhone) {
        super(firstName, lastName, age, gender);
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
    }

    @Override
    public void getInfo() {
        System.out.println("Teacher created.");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Teacher ID: " + getTeacherId());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Teacher Email: " + getTeacherEmail());
        System.out.println("Teacher Phone: " + getTeacherPhone());
        System.out.println();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }
}