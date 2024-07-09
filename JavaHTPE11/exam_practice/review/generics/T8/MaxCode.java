package JavaHTPE11.exam_practice.review.generics.T8;

import java.util.ArrayList;

public class MaxCode {
    public static void main(String[] args) {
        ArrayList<Codeable> arr1 = new ArrayList<Codeable>();
        ArrayList<XXX> arr2 = new ArrayList<XXX>();

        arr1.add(new XXX());
        arr1.add(new YYY());
        arr2.add(new XXX());
        arr2.add((XXX) arr1.get(0));
    }

    public static <T extends Codeable> T maxCode(ArrayList<T> arr) {
        T ans = arr.get(0);

        for (T item : arr) {
            if (item.code() > ans.code()) {
                ans = item;
            }
        }

        return ans;
    }

    public static Codeable codeAll(ArrayList<? extends Codeable> arr) {
        Codeable ans = arr.get(0);
        for (Codeable item : arr) {
            if (item.code() > ans.code())
                ans = item;
        }

        return ans;
    }

}
