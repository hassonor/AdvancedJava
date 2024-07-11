package JavaHTPE11.exam_practice.review.generics.T21;

import JavaHTPE11.exam_practice.exams.a2019_85.Q3.Countable;

import java.util.Stack;

public class GenFind {
    public static <T extends Countable> T genFind(Stack<T> st, int val) {
        T item = null;
        Stack<T> temp = new Stack<T>();

        while (!st.isEmpty()) {
            T next = st.pop();
            temp.push(next);
            if (next.count() == val) {
                item = next;
                break;
            }
        }

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return item;

    }

}
