package JavaHTPE11.exam_practice.review.generics.T5;

import JavaHTPE11.exam_practice.exams.a2022_27.Q3.NonCodeable;

import java.util.ArrayList;

public class Coder {


    public static <T extends Codeable<T>> ArrayList<T> coder(ArrayList<T> arr) {
        ArrayList<T> arr2 = new ArrayList<T>();

        for (T item : arr) {
            try {
                arr2.add(item.code());
            } catch (NonCodeable e) {
                arr2.add(item);
            }
        }

    }


}
