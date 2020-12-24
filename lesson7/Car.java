package com.company.oldLesson.lesson7;

public class Car {

    String color;
    String engine;
    static int count;


    public Car(String color, String engine){
        this.count++;
        this.color = color;
        this.engine = engine;
    }
    public void ShowColor(){
        System.out.println("Цвет машины: " + "color");
        this.changeColor("red");
    }

    public void changeColor(String color) {
        System.out.println(this.color);

    }

    void abc(int a, int b){

    }

    void abcd(int a, int b){

    }

   public static class CarTest{
        public static void main(String[] args) {
            Car bmw = new Car("red","v6");
            System.out.println(bmw.color);
            bmw.changeColor("black");
            System.out.println(bmw.color);

        }
    }


}
