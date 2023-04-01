package com.robot_dreams.homework_11;

public class Main {
    public static void main(String[] args) {
        // ООП. Частина 2
        Car car = new Car("Легковий автомобіль");
        CarPassenger carPass = new CarPassenger();
        CarTruck truck = new CarTruck();

        System.out.println("Тип автомобіля класу Car: " + car.getType() + ".");
        System.out.println("Тип автомобіля класу легкового автомобіля: " + carPass.getType() + ".");
        System.out.println("Тип автомобіля класу вантажного автомобіля: " + truck.getType() + ".");
    }
}