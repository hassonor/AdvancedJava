package JavaHTPE11.exam_practice.exams.a2024_89.Q3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Convertor a = new Convertor();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("27");
        arr.add("3");
        arr.add("10");
        try {
            System.out.println(a.transform(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T extends Comparable<T>> T genApply(GenTrasformable<T, T> obj, ArrayList<T> arr) throws Exception {
        T min = null;
        for (T item : arr) {
            T temp = obj.transform(item);
            if (min == null || min.compareTo(temp) > 0)
                min = item;
        }

        return min;
    }
}
