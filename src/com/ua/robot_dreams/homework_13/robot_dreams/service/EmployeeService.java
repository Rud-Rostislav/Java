package com.ua.robot_dreams.homework_13.robot_dreams.service;

import com.ua.robot_dreams.homework_13.robot_dreams.domain.Employee;
import com.ua.robot_dreams.homework_13.robot_dreams.repository.MemoryRepo;

public class EmployeeService {

    private final MemoryRepo memoryRepo;

    public EmployeeService() {
        memoryRepo = new MemoryRepo();
    }

    public void printEmployees() {
        printHeader();
        for (Employee employee : memoryRepo.findAll()) {
            if (employee != null) {
                String body = String.format("|%-5d |%-20s |%-20s |%-10d |%-10d|", employee.getId(), employee.getFirstName(),
                        employee.getLastName(), employee.getAge(), employee.getSalary());
                System.out.println(body);
            }
        }
    }

    private void printHeader() {
        printDivider();
        System.out.printf("|%-5s |%-20s |%-20s |%-10s |%-10s|%n", "id",
                "firstName", "lastName", "age", "salary");
        printDivider();
    }

    public void printEmployee(Employee employee) {
        printHeader();
        String body = String.format("|%-5d |%-20s |%-20s |%-10d |%-10d|", employee.getId(), employee.getFirstName(),
                employee.getLastName(), employee.getAge(), employee.getSalary());
        System.out.println(body);
    }

    public Employee[] findAll() {
        return memoryRepo.findAll();
    }

    public Employee findEmployeeMaxSalary (Employee[] employees) {
        int maxSalary = 0;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public Employee findEmployeeMinSalary (Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    public double calculateTaxes(Employee[] employees) {
        double taxes = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                taxes += employee.getSalary() * 0.195;
            }
        }
        return taxes;
    }

    private void printDivider() {
        for (int i = 0; i < 75; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

}
