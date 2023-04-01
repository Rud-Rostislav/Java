package com.robot_dreams.homework_7;

public class Main {
    public static void main(String[] args) {
        // Методи. Перевантаження
        System.out.println(cube());
        printStar(10);
        printElement("&", 15);
    }

    static int cube() {
        return 3 * 3 * 3;
    }

    static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printElement(String element, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(element);
        }
        System.out.println();
    }
}