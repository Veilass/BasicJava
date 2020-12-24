package com.company.oldLesson.lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest {


    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        Student st1 = new Student("Kolya", 3, 7.5);
        Student st2 = new Student("Kolya", 3, 6.9);

        st.sravnenieStudent(st1, st2);
        st.sravStud2(st1, st2);
    }
        void sravnenieStudent (Student s1, Student s2){
            if (s1.name.equals(s2.name)&& s1.course == s2.course && s1.grade == s2.grade) {
                System.out.println("Студенты равны");
            } else {
                System.out.println("Студенты не равны");
            }
        }
        void sravStud2 (Student s1, Student s2){
            if(s1.name.equals(s2.name)){
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("У них одинаковые имена,курс,оценки");
                } else {
                    System.out.println("у них разный имена,курс, оценки разные");
                  }
                } else{
                    System.out.print("Имена одинаковые, курсы разные");
                }
            }else {
                System.out.println("Имена студентов разные");
            }
    }
}