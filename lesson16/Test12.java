package com.company.lesson16;

public class Test12 {
    public static void main(String[] args) {
//        String s1 = "privet";
//        System.out.println(s1.isBlank());
//        String s2 = "   ";
//        System.out.println(s2.isBlank());
//        String s3 = "";
//        System.out.println(s3.isEmpty());


        String s4 = " kek kek        ";
        System.out.println(s4.stripTrailing());

        String s5 = "poka";
        String s6 = s5.strip();
        System.out.println(s5 == s6);
    }
}
