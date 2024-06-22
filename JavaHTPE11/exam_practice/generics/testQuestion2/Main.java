package JavaHTPE11.exam_practice.generics.testQuestion2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static <T extends Comparable<T>> Stack<T> reduceStack(Stack<T> st, T item) {
        Stack<T> stHelper = new Stack<T>();

        while (!st.isEmpty()) {
            T tempItem = st.pop();
            if (tempItem.compareTo(item) <= 0)
                stHelper.push(tempItem);
        }

        while (!stHelper.isEmpty()) {
            st.push(stHelper.pop());
        }

        return st;
    }

    public static ColoredShape getColoredShape(ArrayList<? extends ColoredShape> arr, Color color) {
        for (ColoredShape item : arr) {
            if (item.getColor().equals(color))
                return item;
        }

        return null;
    }


}
