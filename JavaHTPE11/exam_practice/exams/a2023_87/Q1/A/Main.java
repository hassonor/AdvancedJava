package JavaHTPE11.exam_practice.exams.a2023_87.Q1.A;

import JavaHTPE11.exam_practice.exams.a2023_87.Q1.MMM;
import JavaHTPE11.exam_practice.exams.a2023_87.Q1.Data;


/*
    This code will print:
    a equals b false
    b equals a false
 */
public class Main {
    public static void main(String[] args) {
        MMM a = new Data();
        Data b = new Data();
        a.apply();
        b.apply();
        System.out.println("a equals b " + a.equals(b));
        System.out.println("b equals a " + b.equals(a));

    }
}
