package com.robot_dreams.homework_13.table_employee;

import static com.robot_dreams.homework_13.table_employee.Employee.employees;

public class Main {
    public static void main(String[] args) {
        employees.add(new Employee(1, "John", 30, 500.23));
        employees.add(new Employee(2, "Jane", 25, 400.78));
        employees.add(new Employee(3, "Bob", 40, 600.23));

        Employee.printTable();
        Employee.removeEmployeeById(1);
    }
}