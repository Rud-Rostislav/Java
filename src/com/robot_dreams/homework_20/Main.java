package com.robot_dreams.homework_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Колекції. Частина 3
        Map<String, List<String>> map = new HashMap<>();
        map.put("Привіт", Arrays.asList("Hello", "こんにちは", "Hallo"));
        map.put("Бувай", Arrays.asList("Bye", "さよなら", "Tschüss"));
        map.put("Чудово", Arrays.asList("Perfectly", "完璧に", "Perfekt"));
        map.put("Програмування", Arrays.asList("Programming", "プログラミング", "Programmierung"));
        map.put("Технології", Arrays.asList("Technologies", "テクノロジー", "Technologien"));
        map.put("Код", Arrays.asList("Code", "コード", "Code"));
        map.put("Сонце", Arrays.asList("Sun", "太陽", "Sonne"));
        map.put("Радість", Arrays.asList("Joy", "喜び", "Freude"));
        map.put("Дружба", Arrays.asList("Friendship", "友情", "Freundschaft"));
        map.put("Мир", Arrays.asList("Peace", "平和", "Frieden"));

        System.out.println("Вітаємо у перекладачу. Для виходу введіть 'Вихід'.");
        System.out.println("Для показу всіх слів введіть 'Всі слова'.");
        System.out.println("--------------------------------------------------------");
        System.out.println("Введіть слово для перекладу: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while (!word.equals("Вихід")) {
            if (word.equals("Всі слова")) {
                System.out.println("Список усіх слів: ");
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + ".");
                }
            } else {
                List<String> translations = map.get(word);
                if (translations != null) {
                    System.out.println("'" + word + "' на англійській мові: " + translations.get(0) + ".");
                    System.out.println("'" + word + "' на японській мові: " + translations.get(1) + ".");
                    System.out.println("'" + word + "' на німецькій мові: " + translations.get(2) + ".");
                } else {
                    System.out.println("Слова немає у перекладачі, або воно невірно введено.");
                }
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Введіть слово для перекладу: ");
            word = scanner.nextLine();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Програма завершила свою роботу.");
    }
}