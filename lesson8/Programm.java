package com.company.oldLesson.lesson8;

public class Programm {
}

class Test1{
    int a =1;
    static int b =2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test1.b);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc(4);
    }
}