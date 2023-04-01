package com.robot_dreams.homework_7;

public class Main {
    public static void main(String[] args) {
        System.out.println(cube(3));
        printStar(5);
        printElement("&", 15);
    }

    static int cube(int a) {
        return a * a * a;
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