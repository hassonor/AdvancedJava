package JavaHTPE11.ClassLesson11_test_questions.testQuestion1_generics.c;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;
import JavaHTPE11.ClassLesson11_test_questions.testQuestion1_generics.a.ISortedQuestion;
import JavaHTPE11.ClassLesson11_test_questions.testQuestion1_generics.b.Student;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            students.add(new Student("Student_" + i, r.nextInt(101)));
        }

        try {
            System.out.println(students);
            System.out.println(ISortedQuestion.isSorted(students));
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }
}
