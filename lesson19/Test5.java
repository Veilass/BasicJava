package com.company.lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[]students = {"Ivanov","Andreev","Sidorov"};
        String[]exams = {"mat analiz","filosophia"};

        for(String s1:students){
            for(String s2: exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
