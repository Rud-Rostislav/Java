package com.robot_dreams.homework_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Масиви
        int[] arr = new int[10];
        createArrayRandom(arr);
        printArray(arr);
        minValue(arr);
        maxValue(arr);
        averageValue(arr);
        System.out.println("Сума всіх елементів: \n" + sumAllValue(arr));
    }

    static void createArrayRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 10);
        }
    }

    static void printArray(int[] arr) {
        System.out.println("Масив з 10 елементів:");
        System.out.print("{ ");
        for (int j : arr) {
            System.out.print(j + "; ");
        }
        System.out.print("}");
    }

    static void minValue(int[] arr) {
        System.out.println("\nМінімальне значення:");
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }

    static void maxValue(int[] arr) {
        System.out.println("Максимальне значення:");
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }

    static void averageValue(int[] arr) {
        float avr = (float) sumAllValue(arr) / arr.length;
        System.out.println("Cереднє значення елементів:");
        System.out.println(avr);
    }

    static int sumAllValue(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}