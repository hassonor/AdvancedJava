package JavaHTPE11.exam_practice.review.generics.T4;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;
import java.util.Random;

public class IsSorted {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            students.add(new Student("Student_" + i, r.nextInt(101)));
        }

        try {
            System.out.println("Is Sorted?:" + isSorted(students));
        } catch (IllegalDataException e) {
            e.printStackTrace();
        }

    }

    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> arr) throws IllegalDataException {
        if (arr == null || arr.isEmpty())
            throw new IllegalDataException();

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).compareTo(arr.get(i + 1)) > 0)
                return false;
        }

        return true;

    }

}
