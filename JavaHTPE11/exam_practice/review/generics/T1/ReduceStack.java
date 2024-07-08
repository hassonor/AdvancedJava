package JavaHTPE11.exam_practice.review.generics.T1;

import java.util.Stack;

public class ReduceStack {

    public static <T extends Comparable<T>> T reduceStack(Stack<T> st, T el) {
        Stack<T> st2 = new Stack<T>();
        T min = null;

        while (!st.isEmpty()) {
            T next = st.pop();
            if (next.compareTo(el) <= 0)
                st2.push(next);
            else {
                if (min == null || min.compareTo(next) > 0)
                    min = next;
            }

        }

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return min;
    }

}
