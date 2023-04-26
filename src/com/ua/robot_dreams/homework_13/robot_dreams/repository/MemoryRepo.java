package com.ua.robot_dreams.homework_13.robot_dreams.repository;

import com.ua.robot_dreams.homework_13.robot_dreams.domain.Employee;

import java.util.Random;

public class MemoryRepo {

    private final Employee[] employees = new Employee[10];

    public MemoryRepo() {
        fillArrayEmployees();
    }

    public Employee[] findAll() {
        return employees;
    }

    public void save(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void fillArrayEmployees() {
        for (int i = 0; i < 5; i++) {
            Employee employee = getRandomEmployees();
            employee.setId(i);
            save(employee);
        }
    }

    private static Employee getRandomEmployees() {
        Random random = new Random();
        int nameSize = random.nextInt(5, 6);
        String firstName = generateRandomString(nameSize);
        String lastName = generateRandomString(nameSize);
        int age = random.nextInt(18, 65);
        int salary = random.nextInt(300, 6200);

        return new Employee(1, firstName, lastName, age, salary);
    }

    public static String generateRandomString(int size) {
        String allChar ="abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                result.append(allChar.charAt(random.nextInt(allChar.length())));
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }

}