package com.ua.robot_dreams.homework_34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executorService.submit(new RandomNumberCallable());
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
