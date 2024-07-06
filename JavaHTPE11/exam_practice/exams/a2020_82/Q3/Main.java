package JavaHTPE11.exam_practice.exams.a2020_82.Q3;

import java.util.ArrayList;

public class Main {
    public static <T extends Reverseable<T>> ArrayList<T> reverseAll(ArrayList<T> arr) {
        ArrayList<T> ans = new ArrayList<T>();

        for (T item : arr) {
            try {
                ans.add(item.reverse());
            } catch (NonReverseable e) {
                ans.add(item);
            }
        }

        return ans;
    }
}
