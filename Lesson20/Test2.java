package com.company.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hi"));
        list.add(new StringBuilder("Poka"));
        list.add(new StringBuilder("Dosvidos"));
        list.add(1,new StringBuilder("Ok"));
        for (StringBuilder s:list){
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Smorodinov"));
        list2.add(new StringBuilder("Sidorov"));

        list.addAll(list2);
        list2.get(1).append("!");

        for (StringBuilder s:list) {
            System.out.print((s + " "));
        }

    }
}
