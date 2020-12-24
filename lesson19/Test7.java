package com.company.lesson19;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Priveet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("Ojk");
        StringBuilder[]array={sb1,sb2,sb3};
        for (StringBuilder sb:array){
            sb.append(" Java");
        }


        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
