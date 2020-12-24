package com.company.oldLesson.lesson5;

public class Student {
        int ticket;
        String name;
        String surname;
        int yearsLearn;
        float ratingMath;
        float ratingEconomic;
        float ratingForeignlan;
}

class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Алексей";
        st1.surname = "Попов";
        st1.ratingMath = 4.2f;
        st1.ratingEconomic = 3.5f;
        st1.ratingForeignlan = 4.9f;


        Student st2 = new Student();
        st2.name = "Иван";
        st2.surname = "Леонидов";
        st2.ratingMath = 4.1f;
        st2.ratingEconomic = 4.3f;
        st2.ratingForeignlan = 4.6f;


        Student st3 = new Student();
        st3.name = "Василий";
        st3.surname = "Летов";
        st3.ratingMath = 3.5f;
        st3.ratingEconomic = 5.0f;
        st3.ratingForeignlan = 5.0f;

        System.out.println("Средняя оценка студента " + st1.name + " " + st1.surname + " = " + (st1.ratingMath + st1.ratingForeignlan + st1.ratingEconomic) / 3);
        System.out.println("Средняя оценка студента "  + st2.name + " " + st2.surname + " = " +  (st2.ratingMath  + st2.ratingForeignlan + st2.ratingEconomic) / 3);
        System.out.println("Средняя оценка студента "  + st3.name + " " + st3.surname + " = " + (st3.ratingMath  + st3.ratingForeignlan +  st3.ratingEconomic) / 3);
    }


}