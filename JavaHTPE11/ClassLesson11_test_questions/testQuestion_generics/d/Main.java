package JavaHTPE11.ClassLesson11_test_questions.testQuestion_generics.d;

import JavaHTPE11.ClassLesson11_test_questions.testQuestion_generics.b.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arr1 = new ArrayList<Student>();
        ArrayList<GradStudent> arr2 = new ArrayList<GradStudent>();

        // arr1 = arr2 ! Compilation Error
        // arr2 = arr1 ! Compilation Error

        Student s1 = new Student("Joe", 100);
        GradStudent s2 = new GradStudent("Joe2", 100);

        s1 = s2;
        // s2 = s1; ! Compilation Error

        ArrayList<? extends Student> arr3 = new ArrayList<Student>();
        ArrayList<GradStudent> arr4 = new ArrayList<GradStudent>();

        arr3 = arr4;
        
    }
}
