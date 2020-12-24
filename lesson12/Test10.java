package com.company.oldLesson.lesson12;


public class Test10 {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;
        int maximum = (a>b)?a:b;
        System.out.println(maximum);
    }

    void maximum(int i1, int i2, int i3){
        if(i1 > i2 && i1 > i3){
            int a = 5;
            System.out.println("Maximum - " + i1);
        }else if(i2>i1 && i2>i3){
            int a = 10;
            System.out.println("Maximum - " + i2);
        } else{
            int a =15;
            System.out.println("Maximum - " + i3);
        }
    }

    void abc(){
        String str;
        int a = 5;
        if(a>=10){
            System.out.println("Privet");
        }if(a<10) {
            System.out.println("Poka");
        }
    }
}
