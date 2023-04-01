package com.robot_dreams.homework_22;

import java.util.Comparator;
import java.util.List;

public record Student(String lastName, double averageGrade) {
    public static void printStudents(List<Student> students) {
        System.out.println("Оригінальний список студентів: ");
        students.forEach(System.out::println);
    }

    public static void sortByName(List<Student> students) {
        System.out.println("\nСписок студентів, відсортований за прізвищем: ");
        students.stream().sorted(Comparator.comparing(Student::lastName)).forEach(System.out::println);
    }

    public static void sortByAverage(List<Student> students) {
        System.out.println("\nСписок студентів, відсортований за середнім балом, які здали екзамен: ");
        students.stream().filter(student -> student.averageGrade >= 3)
                .sorted(Comparator.comparing(Student::averageGrade)).forEach(System.out::println);
        System.out.println("\nСписок студентів, відсортований за середнім балом, які не здали екзамен: ");
        students.stream().filter(student -> student.averageGrade < 3)
                .sorted(Comparator.comparing(Student::averageGrade)).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Студент " + lastName + ", середній бал = " + averageGrade + ".";
    }
}