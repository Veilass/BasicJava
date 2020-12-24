package com.company.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("ok"));

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5);
        list2.add("kek");
        list2.add("Doina");
        List<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("kek"));

        System.out.println(list2.get(0));
    }



}


class Student{}


class Car{}
