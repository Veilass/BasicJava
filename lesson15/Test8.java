package com.company.oldLesson.lesson15;

public class Test8 {
    public static void main(String[] args) {

        OUTER:
        for(int chas = 0; chas < 24; chas++){
            int min = 0;
            INNER:
            while (min < 60){
                if(min < 10) {
                    System.out.println(chas + ":0" + min);
                }else {
                    System.out.println(chas + ":" + min);
                }
                min++;
            }
        }
    }
}
