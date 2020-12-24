package com.company.oldLesson.lesson5;

public class Test20 {
    public static void main(String[] args) {
    }
    int sum(int a, int b, int c) {
        int result = a + b + c;
        String s = "Privet";
        return result;
    }
}

class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        System.out.println(t.sum(1,1,1));

    }
}
