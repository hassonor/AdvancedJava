package JavaHTPE11.exam_practice.review.generics.T6;

import java.util.Stack;

public class CountableStack<T extends Countable> {
    private Stack<T> st;

    public CountableStack(Stack<T> st) {
        this.st = st;
    }

    public T find(int value) {
        Stack<T> temp = new Stack<T>();
        T item = null;

        while (!st.isEmpty()) {
            T next = st.pop();
            temp.push(next);
            if (next.count() == value) {
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
