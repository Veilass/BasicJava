package com.company.oldLesson.lesson4;

import java.util.Scanner;

public class С {
    private static String p1,p2;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Первый игрок выберите что хотите: ");
        p1 = in.next();
        System.out.print("Второй игрок выберите что хотите: ");
        p2 = in.next();
        DataCom("Kel", "Vol");
    }


    static void DataCom(String pl1, String pl2) {
                if (p1.equals("paper") && p2.equals("paper")){
                    System.out.println("ничья");
                } else if (p1.equals("rock") && p2.equals("paper")) {
            System.out.println("2 игрок выйграл");
                } else if(p1 == "paper"){
                     }if (p2 == "scissors") {
            System.out.println("Ножницы выйграли");
                }else if(p1 == "rock"){
                }if(p2 == "scissors"){
            System.out.println("Камень выйграл");
        }

        }
}