package JavaHTPE11.exam_practice.exams.b2021_74.Q3;

import java.util.ArrayList;

public class Main {
    public static <T extends Copyable<T>> ArrayList<T> arrayCopy(ArrayList<T> arr) throws CloneNotSupportedException{
        ArrayList<T> arr2 = new ArrayList<T>();

        for(T item: arr){
            arr2.add(item.copy());
        }

        return arr2;
    }
}
