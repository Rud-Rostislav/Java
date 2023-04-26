package com.ua.robot_dreams.homework_15;

public class Main {
    public static void main(String[] args) {
        // Інтерфейси. Поліморфізм
        Driving driver = new Driver();
        driver.drive();

        Flying pilot = new Pilot();
        pilot.fly();
    }
}