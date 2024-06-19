package JavaHTPE11.ClassLesson11_test_questions.testQuestion_generics.a;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;

public class ISortedQuestion {
    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> array) throws IllegalDataException {
        if (array == null || array.isEmpty())
            throw new IllegalDataException();

        T temp = null;
        for (T item : array) {
            if (temp == null)
                temp = item;
            else if (temp.compareTo(item) > 0)
                return false;
        }

//        for (int i = 1; i < array.size(); i++) {
//            if (array.get(i).compareTo(array.get(i - 1)) < 0)
//                return false;
//        }
//
//        for (int i = 0; i < array.size() - 1; i++) {
//            if (array.get(i + 1).compareTo(array.get(i)) < 0)
//                return false;
//        }
        return true;
    }
}
