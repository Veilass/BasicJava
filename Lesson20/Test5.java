package com.company.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Hi"));
        list.add(new String("Poka"));
        list.add(new String("Dosvidos"));
        list.add(new String("Ok"));

//        for (String sb: list) {
//            System.out.print(sb + " ");
//        }
        System.out.print(list.indexOf(new String("Poka")));
        System.out.println();
        System.out.println(list.size());
//        list.clear();
        System.out.println(list.isEmpty());

        System.out.println(list.toString());
    }
}
