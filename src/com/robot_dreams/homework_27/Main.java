package com.robot_dreams.homework_27;

public class Main {
    public static void main(String[] args) {
        // Робота з файлами. Частина 1
       FileManager fileManager = new FileManager("file.txt");
       fileManager.writeToFile("Hello world!");
       fileManager.readFromFile();
    }
}