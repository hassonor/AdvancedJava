package JavaHTPE11.exam_practice.exams.a2019_86.Q1;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

public class Test {
    public static void main(String[] args) {
//        Applyable a = new App1();
//        App1 b = new App1();
//        a.apply();
//        b.apply();
//        System.out.println("a equals b " + a.equals(b));
//        System.out.println("b equals a " + b.equals(a));

//        Applyable a1 = new App1();
//        a1.step(3); // Compilation Error. Applyable doesn't have step method
//        a1.apply();
//        System.out.println("a1 = " + a1);


//        App1 a = new App1();
//        Applyable b = new App2("hi");
//        a.apply(); // num = 1;
//        b.apply(); // num = 1; st = "i";
//        System.out.println("a equals b " + a.equals(b)); // a equals b false
//        System.out.println("b equals a " + b.equals(a)); // in App2 b equals a true

//        App1 a1 = new App2("abc");
//        int len = (a1.toString()).length();
//        a1.step(len);
//        System.out.println("a1=" + a1); // a1=

        try {
            App2 a3 = new App2(90, "abcd");
            System.out.println(a3);
            System.out.println(a3.getNum());
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }
}
