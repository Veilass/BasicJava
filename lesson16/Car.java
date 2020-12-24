package com.company.lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;

    }
    final static int a =5;

    public Car abc(String cvet){
        Car c10 = new Car(cvet,"b4");
        return c10;
    }
}

class TestCar{
    public static void main(String[] args) {
        Car c = new Car("red", "v8");
        Car c2 = c.abc("black");
        System.out.println(c.color);
    }
}
