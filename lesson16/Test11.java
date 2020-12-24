package com.company.lesson16;

public class Test11 {
    String email;

    public void email(String email) {
        this.email = email;
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < email.length() - 1) {


            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1,b) );
        }
    };

    public static void main(String[] args) {
        Test11 test11 = new Test11();
        test11.email("kewk@tupoi.com; ulb@gmail.com; yewge@yahoo.com;");
    }

}
