package JavaHTPE11.exam_practice.review.generics.T27;

import java.util.Stack;

public class ReduceStack {

    public static <T extends Comparable<T>> Stack<T> reduceStack(Stack<T> st, T item) {
        Stack<T> temp = new Stack<T>();

        while (!st.isEmpty()) {
            T next = st.pop();
            if (next.compareTo(item) <= 0)
                temp.push(next);
        }

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return st;
    }

}
