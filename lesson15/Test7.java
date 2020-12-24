package com.company.oldLesson.lesson15;

public class Test7 {
    public static void main(String[] args) {
        int chas = 0;
        OUTER:
        do {
            int min = 0;

            INNER:
            while (min < 60) {
                if(min < 10){
                    System.out.println(chas + ":0" + min);
                }else
                System.out.println(chas + ":" + min);
                min++;

            }
            chas++;
        } while (chas< 24);
    }
}
