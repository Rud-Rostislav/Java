package com.robot_dreams.homework_27;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Робота з файлами. Частина 1
        writeToFile("file.txt", "Hello world!");
        readFromFile("file.txt");
    }

    public static void writeToFile(String file, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(data);
            writer.close();
            System.out.println("Запис файлу " + file + " успішно завершено.");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    public static void readFromFile(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println("Читаємо файл " + file + ":");
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}