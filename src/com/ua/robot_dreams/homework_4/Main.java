package com.ua.robot_dreams.homework_4;

public class Main {
    public static void main(String[] args) {
        // Операцї над строками
        String str = "Robot Dreams";
        System.out.println("Оригінальний текст:\n" + str + "\n");
        System.out.println("Верхній регістр:\n" + str.toUpperCase() + "\n");
        System.out.println("Нижній регістр:\n" + str.toLowerCase() + "\n");
        System.out.println("Перша буква:\n" + str.charAt(0) + "\n");
        System.out.println("Остання буква:\n" + str.charAt(str.length() - 1) + "\n");
    }
}
