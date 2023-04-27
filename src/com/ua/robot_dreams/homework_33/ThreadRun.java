package com.ua.robot_dreams.homework_33;

import java.util.Random;

public class ThreadRun implements Runnable {
    Random random = new Random();
    int number = random.nextInt(1, 10);

    @Override
    public void run() {
        System.out.println("Потік запущено.");
        while (true) {
            System.out.println(number);
            if (number == 5) {
                System.out.println("Число = 5. Потік завершено.");
                break;
            } else {
                number = random.nextInt(1, 10);
            }
        }
    }
}