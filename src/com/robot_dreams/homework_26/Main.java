package com.robot_dreams.homework_26;

public class Main {
    public static void main(String[] args) {
        // Винятки. Частина 2
        calculateSquare(5);
        calculateSquare(-5);
        calculateSquare(3);
        calculateSquare(-7);
    }

    public static void calculateSquare(int num) {
        try {
            if (num < 0) {
                throw new NegativeNumberException(num);
            } else {
                System.out.println("Квадрат числа " + num + " = " + num * num + ".");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}