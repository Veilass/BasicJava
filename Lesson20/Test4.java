package com.company.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hi"));
        list.add(new StringBuilder("Poka"));
        list.add(new StringBuilder("Dosvidos"));
        list.add(1,new StringBuilder("Ok"));
        System.out.println(list.toString());

//        for (StringBuilder sb: list) {
//            System.out.println(sb + " ");
//        }
//        System.out.println(list.contains(sb));
    }
}
