package JavaHTPE11.exam_practice.exams.a2022_24.Q3;

import java.util.Stack;

public class CountableStack<T extends Countable> {
    private Stack<T> st;

    public CountableStack() {
        st = new Stack<T>();
    }

    public T find(int num) {
        Stack<T> st2 = new Stack<T>();
        T returnItem = null;

        while (!st.isEmpty()) {
            T item = st.pop();
            st2.push(item);
            if (item.count() == num) {
                returnItem = item;
                break;
            }
        }

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return returnItem;
    }

}
