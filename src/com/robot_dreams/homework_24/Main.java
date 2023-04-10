package com.robot_dreams.homework_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введіть число:");
                int number = scanner.nextInt();
                System.out.println("Ви ввели число: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено не число. Спробуйте ще раз.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}