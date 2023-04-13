package com.robot_dreams.homework_27;

import java.io.*;

public class FileManager {
    private final String filename;

    public FileManager(String filename) {
        this.filename = filename;
    }

    public void writeToFile(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(data);
            writer.close();
            System.out.println("Запис до файлу успішно завершено.");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    public void readFromFile() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
        System.out.println("Текст із файлу:");
        System.out.println(sb);
    }
}
