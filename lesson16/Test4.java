package com.company.lesson16;

public class Test4 {
}



class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean inManager) {
        this.salary = salary;
        this.isManager = inManager;
    }
}
    class TestEmployee{
        public static void main(String[] args) {
            Employee emp = new Employee(100.5,true);
            System.out.println("This manager? " + emp.isManager + " This she salary:" + emp.salary);
        }
    }

