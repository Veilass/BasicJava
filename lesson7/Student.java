package com.company.oldLesson.lesson7;

public class Student {
  int a = 10;

  int b = this.a;
  static int c = 5;
  int z = this.c;
  static int f = c;
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
    }
}
