package com.ua.robot_dreams.homework_10;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumbers {
    int[] arr;

    public ArrayNumbers(int arrayLength, int lowerNumber, int highestNumber) {
        Random random = new Random();
        arr = new int[arrayLength];
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(lowerNumber, highestNumber);
        }
    }

    public void printArray() {
        System.out.print("{ ");
        for (int j : arr) {
            System.out.print(j + "; ");
        }
        System.out.println("}");
    }

    public void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        printArray();
    }

    public void sortReverseArray() {
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        printArray();
    }
}