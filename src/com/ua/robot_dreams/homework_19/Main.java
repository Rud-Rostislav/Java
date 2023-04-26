package com.ua.robot_dreams.homework_19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Колекції. Частина 2
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            hashSet.add(rand.nextInt(1, 50));
            linkedHashSet.add(rand.nextInt(1, 50));
            treeSet.add(rand.nextInt(1, 50));
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}