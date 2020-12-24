package com.company.lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuffer sb2 = new StringBuffer("good bye!");

        String s1 = new String(sb1);
        String s2 = new String(sb2);
    }
}
