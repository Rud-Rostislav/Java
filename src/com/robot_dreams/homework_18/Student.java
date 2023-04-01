package com.robot_dreams.homework_18;

public class Student {
    private final String name;
    private final int age;
    private static int startId = 0;
    private final int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++startId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}