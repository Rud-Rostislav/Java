package com.ua.robot_dreams.homework_32;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("| " + Thread.currentThread().getName() + " стартував. |");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " = " + i + ".");
        }
        System.out.println("| " + Thread.currentThread().getName() + " закінчився. |");
    }
}