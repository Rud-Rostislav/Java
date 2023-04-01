package com.robot_dreams.homework_5;

public class Main {
    public static void main(String[] args) {
        // Умовні оператори
        int a = 53;
        int b = 36;
        int c = 32;
        int d = 46;
        int e = 52;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(b + " > " + a);
        }

        if (d < c) {
            System.out.println(d + " < " + c);
        } else {
            System.out.println(c + " < " + d);
        }

        if (e % 2 == 0) {
            System.out.println("Число" + e + "парне");
        } else {
            System.out.println("Число " + e + " не парне");
        }
    }
}