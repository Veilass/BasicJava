package com.company.lesson18;

public class Test6 {
    public static void main(String[] array) {
        int[]arrgs = new int[]{5, 1, 2, 3, -5, -2};
        int min = arrgs[0];
        int max = arrgs[0];


        for (int i = 1; i <arrgs.length;i++) {

            if (arrgs[i] > max) {
                max = arrgs[i];
            }
            if (arrgs[i] < min) {
                min = arrgs[i];
            }
        }
            System.out.print(min);
            System.out.println();
            System.out.print(max);
    }
}
