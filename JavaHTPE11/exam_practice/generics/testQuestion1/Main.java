package JavaHTPE11.exam_practice.generics.testQuestion1;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

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
            System.out.println(isSorted(students));
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }

    private static <T extends Comparable<T>> boolean isSorted(ArrayList<T> array) throws IllegalDataException {
        if (array == null || array.isEmpty())
            throw new IllegalDataException();
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).compareTo(array.get(i + 1)) > 0)
                return false;
        }
        return true;
    }
}
