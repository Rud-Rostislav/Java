package com.ua.robot_dreams.homework_32;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("| " + Thread.currentThread().getName() + " started. |");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Name: " + Thread.currentThread().getName() + ". Value: " + i + ".");
        }
        System.out.println("| " + Thread.currentThread().getName() + " finished. |");
    }
}