package JavaHTPE11.exam_practice.exams.a2023_87.Q1.B;

import JavaHTPE11.exam_practice.exams.a2023_87.Q1.Data;
import JavaHTPE11.exam_practice.exams.a2023_87.Q1.MMM;

public class Main {
    public static void main(String[] args){
        MMM a1 = new Data();
        Data b1 = new Data();
//        a1.apply(2); // ! Compilation Error, MMM doesn't have apply(int) method
        b1.apply(1);
//        System.out.println("a1.num = " + a1.getNum()); //  ! Compilation Error MMM doesn't have getNum() method
        System.out.println("b1.num = " + b1.getNum());
    }
}
