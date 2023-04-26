package com.ua.robot_dreams.homework_26;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(int num) {
        super("Помилка. Число " + num + " менше нуля.");
    }
}