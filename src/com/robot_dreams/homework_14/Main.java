package com.robot_dreams.homework_14;

public class Main {
    public static void main(String[] args) {
        // Абстрактні та внутрішні класи
        Human student1 = new Student("John", "Smith", 23, "Male", "12345", "John Smith", "jsmith@gmail", "123-456-7890");
        Human teacher = new Teacher("John", "Smith", 23, "Male", "12345", "John Smith", "jsmith@gmail", "123-456-7890");
        student1.getInfo();
        teacher.getInfo();
    }
}