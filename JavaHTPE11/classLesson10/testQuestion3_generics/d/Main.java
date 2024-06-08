package JavaHTPE11.classLesson10.testQuestion3_generics.d;

import JavaHTPE11.classLesson10.testQuestion3_generics.b.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> arr1 = new ArrayList<Student>();
        ArrayList<GradStudent> arr2 = new ArrayList<GradStudent>();
        // arr1 = arr2 // Compilation Error!
        // arr2 = arr1 // Compilation Error!

        ArrayList< ? extends Student> arr3;
        ArrayList< ? super GradStudent> arr4;

        arr3 = arr1;
        arr4 = arr2;
    }
}
