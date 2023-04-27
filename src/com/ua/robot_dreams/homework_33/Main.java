package com.ua.robot_dreams.homework_33;

public class Main {
    public static void main(String[] args) {
        // Багатопотоковість. Частина 2
        ThreadRun threadRunnable = new ThreadRun();
        Thread thread1 = new Thread(threadRunnable);

        thread1.start();
    }
}