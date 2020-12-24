package com.company.Lesson20;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        ListIterator<String> it = list1.listIterator();
        while (it.hasNext()){
            it.next();
            it.remove();
            System.out.println(it.next());

        }

    }
}
