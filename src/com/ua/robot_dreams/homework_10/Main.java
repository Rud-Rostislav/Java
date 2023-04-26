package com.ua.robot_dreams.homework_10;

public class Main {
    public static void main(String[] args) {
        // ООП. Частина 1
        ArrayNumbers array = new ArrayNumbers(10, 1, 100);
        array.printArray();
        array.sortArray();
        array.sortReverseArray();

        Student john = new Student("John", "Donoway", 3, 18, "male", "Journalism");
        System.out.println("\n" + john);
        john.learning();

        Teacher brad = new Teacher("Brad", "Welch", 32, "male", "Engineering");
        System.out.println("\n" + brad);
        brad.teaching();
    }
}
