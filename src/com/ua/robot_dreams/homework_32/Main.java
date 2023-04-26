package com.ua.robot_dreams.homework_32;

public class Main {
    public static void main(String[] args) {
        // Багатопотоковість. Частина 1
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread1 = new Thread(threadRunnable);

        ThreadRunnable threadRunnable2 = new ThreadRunnable();
        Thread thread2 = new Thread(threadRunnable2);

        thread1.setName("Потік 1");
        thread2.setName("Потік 2");

        thread1.start();
        thread2.start();
    }
}