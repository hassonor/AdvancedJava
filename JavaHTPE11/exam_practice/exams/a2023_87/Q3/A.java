package JavaHTPE11.exam_practice.exams.a2023_87.Q3;

import java.util.Stack;

public class A {
    public static void main(String[] args) {
    }

    public static <T extends Comparable<T>> T reduceStack(Stack<T> st, T item) {
        Stack<T> st2 = new Stack<T>();
        T minItem = null;

        while (!st.isEmpty()) {
            T temp = st.pop();
            if (temp.compareTo(item) <= 0)
                st2.push(temp);
            else {
                if (minItem == null)
                    minItem = temp;
                else if (minItem.compareTo(temp) > 0)
                    minItem = temp;
            }
        }

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        return minItem;
    }
}
