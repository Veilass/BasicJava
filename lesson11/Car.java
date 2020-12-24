package com.company.oldLesson.lesson11;

public class Car {
    String color;
    String engine;
    int doorCount;

    Car(String color,String engine,int doors){
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

}


class CarTest{

    public void doors(Car c, int doorCount){
       c.doorCount = doorCount ;
    }


    void changeColor(Car c1,Car c2){
    String color = c1.color;
    c1.color = c2.color;
    c2.color = color;


    }


    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car bmw1 = new Car("White","v9",3);
        Car bmw2 = new Car("Red","v6",5);

        ct.doors(bmw1,5);
        ct.changeColor(bmw1,bmw2);
        System.out.println(bmw1.doorCount);
        System.out.println(bmw1.color + bmw2.color);

    }



}
