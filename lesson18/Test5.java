package com.company.lesson18;

public class Test5 {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        int array2[] = {1,9,3,-8,0,5,4,1};
        int array3[] = array2;


        array1[1] = 0;
        array2[5-3] = 3;
        array1[array1.length] = 10;
        System.out.println(array3.equals(array2));
//        System.out.println(array3 == array2);

        java.lang.String[]array4[]=new java.lang.String[5][];
    }
}
