package com.company.lesson19;

public class Test8 {
    public static void main(String[] args) {
        int[]array = new int[4];
        for (int b:array){
            b = 10;
        }

        for (int a:array){
            System.out.print(a + " ");
        }
    }
}
