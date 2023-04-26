package com.ua.robot_dreams.homework_32;

public class Main {
    public static void main(String[] args) {
        // Багатопотоковість. Частина 1
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread0 = new Thread(threadRunnable);

        ThreadRunnable threadRunnable2 = new ThreadRunnable();
        Thread thread1 = new Thread(threadRunnable2);

        thread0.start();
        thread1.start();
    }
}