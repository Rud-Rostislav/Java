package com.ua.robot_dreams.homework_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Колекції. Частина 1
        ArrayList<Integer> number1 = new ArrayList<>();
        LinkedList<Integer> number2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            number1.add(i);
        }
        for (int i = 0; i < 2000000; i++) {
            number2.add(i);
        }

        System.out.println(number1);
        System.out.println();
        System.out.println(number2);

        List<String> students = new ArrayList<>();
        Student student = new Student("Ivan", 21);
        Student student2 = new Student("Bob", 35);
        Student student3 = new Student("Harry", 27);
        students.add(student.toString());
        students.add(student2.toString());
        students.add(student3.toString());
        System.out.println(students);
    }
}