package com.company.lesson17;

class Car{};

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);
        StringBuilder sb5 = new StringBuilder();

        System.out.println(sb3.length());
        System.out.println(sb2.charAt(4));

        System.out.println(sb2.indexOf("!!!"));
        String s = sb2.substring(5);
        String s2 = sb2.substring(5, 8);

        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8));
//
//        System.out.println(sb2.append("lel"));
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append("hello");
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);
//
        sb2.insert(5,"lep");
        System.out.println(sb2);

//        sb2.delete(0,4);
////        System.out.println(sb2);
//        sb2.deleteCharAt(1);
//        System.out.println(sb2);

        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb12 = new StringBuilder("Vsem ky");
        sb12.replace(0,4,"Pete");
        System.out.println(sb12);
        System.out.println(sb2.capacity());
    }
}
