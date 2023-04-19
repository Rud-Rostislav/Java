package com.robot_dreams.homework_28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // Робота з файлами. Частина 1
        writeToFile("file.txt", "Hello worlds with NIO!");
        readFromFile("file.txt");
    }

    public static void writeToFile(String file, String data) {
        try {
            System.out.println("Запис файлу " + file + " успішно завершено.");
            Files.write(Path.of(file), data.getBytes());
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    public static void readFromFile(String file) {
        try {
            System.out.println("Читання файлу " + file + ":");
            Files.readAllLines(Path.of(file)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}