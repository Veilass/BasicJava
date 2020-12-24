package com.company.lesson18;

public class Test1 {
    public static void main(String[] args) {

        int[]array1;
        String[]array2;
        double[][]array3;
        double[]array7 = new double[2];


        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[2][5];

        int[][]arrayi = new int[][] {
                {-5,2,0,-1},{4},{7,3,-2,5,3}
        };
        int[][]array10 = new int[3][3];

        array2[0] = "ky";
        array2[1] = "poka";
        array2[2] = "ok";

        double[]array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array3[1] = array5;

        array7 = array5;

        System.out.println(array3[1][0]);
    }
}
