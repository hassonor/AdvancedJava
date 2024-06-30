package JavaHTPE11.exam_practice.exams.a2023_87.Q1.C;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;
import JavaHTPE11.exam_practice.exams.a2023_87.Q1.Data2;

public class Main {
    public static void main(String[] args) {
        try {
            Data2 data2 = new Data2(4);
            System.out.println(data2.getNum());
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }
}
