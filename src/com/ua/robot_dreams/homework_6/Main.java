package com.ua.robot_dreams.homework_6;

public class Main {
    public static void main(String[] args) {
        // Цикли
        System.out.println("Числа від 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". ");
        }

        System.out.println("\n\nПарні числа від 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ". ");
        }

        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println("\n\nФакторіал числа 7: \n" + factorial + "\n");

        System.out.println("Фібоначчі до 100:");
        int num0 = 1, num1 = 1, num2;
        num2 = num0 + num1;
        System.out.print(num0 + " " + num1 + " ");
        while (num2 < 100) {
            num2 = num0 + num1;
            if (num2 > 100) {
                break;
            }
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
    }
}