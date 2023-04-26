package com.ua.robot_dreams.homework_12;

public class Car {
    private static int count = 0;
    private final String model;
    private final String color;
    private final int year;

    static {
        System.out.println("Car class is loaded\n");
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        count++;
        System.out.println("Car number " + count + " was created.\n");
        System.out.println("Constructor was called.\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}