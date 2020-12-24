package com.company.lesson19;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = {{3,5,1},{4,5},{9,4,6,3}};
        for (int[] array2:array){
            for(int a:array2){
                System.out.print(a + " ");
            }
        }
    }
}
