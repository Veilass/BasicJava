package com.company.oldLesson.lesson4;

public class Employee {
    public String surname;
    int id;
    int salary;


    public void one1(int id){
        System.out.println(id);
    }
    public void one2(int salary){
        System.out.println(salary);
    }
    public void one3(String surname){
        System.out.println(surname);
    }

    public Employee(int id, int salary, String surname){
        this.id = id;
        this.salary = salary;
        this.surname =surname;
    }
    private Employee(int id, int salary){
        this.id = id;
        this.salary = salary;
    }
    Employee(){
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee kel = new Employee(1,590,"kek");
        System.out.println(kel.id + kel.surname);
//        Employee rqr = new Employee(2,590);
        System.out.println(kel.id + kel.salary);
        Employee ke = new Employee();
//        ke.one1(1,599,"keke");
    }
}



