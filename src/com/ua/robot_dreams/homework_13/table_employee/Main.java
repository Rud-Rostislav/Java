package com.ua.robot_dreams.homework_13.table_employee;

public class Main {
    public static void main(String[] args) {
        // Практичне заняття з ООП
        Employee.employees.add(new Employee(1, "John", 30, 500.23));
        Employee.employees.add(new Employee(2, "Jane", 25, 400.78));
        Employee.employees.add(new Employee(3, "Bob", 40, 600.23));

        Employee.printTable();
        Employee.removeEmployeeById(1);
    }
}