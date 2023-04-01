package com.robot_dreams.homework_23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Петренко", "Нечуй", "Антонов", "Іващенко", "Петренко",
                "Кулишин", "Нечуй", "Геращенко", "Діброва", "Піддубний",
                "Кличко", "Геращенко", "Діброва", "Мартиненко", "Нечуєв",
                "Калинін", "Калужин", "Березовський", "Лисенко", "Геращенко");
        Map<String, Long> surnameCountMap = surnames.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(surnameCountMap);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, -3, -8, 17, 10);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сума чисел: " + sum);
    }
}