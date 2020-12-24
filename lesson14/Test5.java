package com.company.oldLesson.lesson14;

public class Test5 {
    public static void time() {
      OUTER:for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Начало");
           INNER: for (int min = 0; min <= 59; min++) {
                      if(min == 30) {
                          continue OUTER;
                        }
                System.out.println(hour + ":" + min);
            }
            System.out.println("Конец");
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time();
    }
}
