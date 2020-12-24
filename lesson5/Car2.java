package com.company.oldLesson.lesson5;
public class Car2 {
    String color;
    String engine;
    int speed;

    int qaz(int qaz1){
        speed += qaz1;
        return speed;
    }

    int tormoz(int tormoz){
        speed -= tormoz;
        return speed;
    }
    int macbook(){
        int i = 53;
        String ger = "Kel";
        return i;
    }

    void showInfo(){
        System.out.println("Цвет: " + color + " мотор: " + engine + " скорость: " + speed );
    }
}

class Car2main{
public static void main(String[]args){
        Car2 c1 = new Car2();
        c1.color = "Black";
        c1.engine = "v8";
        c1.speed = 52;

        c1.showInfo();
        c1.qaz(10);
        c1.showInfo();
        }
}