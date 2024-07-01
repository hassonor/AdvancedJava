package JavaHTPE11.exam_practice.exams.b2022_89.Q3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Student> students_sorted = new ArrayList<Student>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {

            students.add(new Student("Student_" + i, r.nextInt(101)));
            students_sorted.add(new Student("Student_" + i, i));

        }

        try {
            System.out.println(isSorted(students_sorted));
            System.out.println(isSorted(students));
        } catch (IllegalDataException e) {

            System.out.println(e.getMessage());
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

