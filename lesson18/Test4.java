package com.company.lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1,7,3,-8,5,1,2};
        for (int i = 0; i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i = 0; i<array1.length;i++){
            System.out.print( + array1[i] + " ");
        }

        System.out.println();
        System.out.println(array1);
//        int index1 = Arrays.binarySearch(array1, 4);
//        System.out.println(index1);

    }
}
