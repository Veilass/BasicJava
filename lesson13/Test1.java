package com.company.oldLesson.lesson13;

public class Test1 {



    public static void time(){
       OUTPUT: for(int hour = 0; hour <=6; hour++ ){
           INVERSE: for(int min = 0;min <= 10; min++){
                    if(hour > 1 && min % 10 == 0){
                        break OUTPUT;
                    }
               VERSE: for(int sec = 0;sec <= 59; sec++){
                        if(sec * hour > min){
                            continue VERSE;
                        }
                    System.out.println(hour + ":" + min + ":" + sec);

                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}



