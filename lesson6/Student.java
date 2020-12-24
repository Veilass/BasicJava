package com.company.oldLesson.lesson6;

public class Student {
    String name;
    int course;
    static int count;
    static int a;
    static int b;
    static int c;
    static final float pi = 3.14f;
    static float radius;


    public static int Umnoshenie(int a, int b, int c){
    return a * b * c;
    }
    public static void Delenie(int a, int b){
      int result = a / b;
      int ostatok = a % b;
        System.out.println("delenie: " + result + "\n ostatok: " + ostatok);
    }

    public Student(String name, int course) {
        count++;
        name = name;
        course = course;
        System.out.println("Student # " + count + " создан ");
    }

    public float Area(float radius){
        float Area;
        Area = pi * radius * radius;
        return Area;
    }

    public static float Lenght(float radius){
        float lenght = 2 * pi * radius;
        return lenght;
    }


    public static void showCount(){
        System.out.println("Всего студентов:" + count);
    }
    public void showInfo(){
        System.out.println("Приветсвую этот класс!!!");
    }

    void abc(){
        a++;
    }

    void showInfo2(float radius){
        System.out.println("radius: " +radius);
        System.out.println("dlina: " + Lenght(radius));
        System.out.println("Площадь: " + Area(radius));
    }
}
    class StudentTest{
        public static void main(String[] args) {
            Student st1 = new Student("Lexa",1);
            Student st2 = new Student("Kirill",3);
            Student st3 = new Student("Masha",2);

            System.out.println(st1.name);
            st1.showCount();
            System.out.println(st1.Umnoshenie(5,5,5));
            st1.Delenie(6,2);
            System.out.println(st2.Umnoshenie(5,5,5));
            st2.Delenie(8,2);
            st1.showInfo2(3.2f);
        }
    }
