package com.robot_dreams.homework_25;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(int num) {
        super("Помилка. Число " + num + " менше нуля.");
    }
}