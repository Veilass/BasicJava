package com.company.oldLesson.lesson13;

public class Month {
    public int month;

    public static void dayMonth(int n) {
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("31 день в месяце");
                break;
            case 2:
                System.out.println("28 день в месяце");
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                System.out.println("30 день в месяце");
                break;
        }
    }

    public static void main(String[] args) {
        Month.dayMonth(2);
        dayMonth(3);
        Month.dayMonth(5);
    }

}




