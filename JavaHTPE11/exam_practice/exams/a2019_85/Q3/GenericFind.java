package JavaHTPE11.exam_practice.exams.a2019_85.Q3;

import java.util.Stack;

public class GenericFind {
    public static <T extends Countable> T genFind(Stack<T> st, int num) {
        Stack<T> st2 = new Stack<T>();
        T item = null;

        while (!st.isEmpty()) {
            T next = st.pop();
            st2.push(next);
            if (next.count() == num) {
                item = next;
                break;
            }
        }

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return item;

    }

}
