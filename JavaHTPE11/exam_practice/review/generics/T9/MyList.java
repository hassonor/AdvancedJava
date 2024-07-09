package JavaHTPE11.exam_practice.review.generics.T9;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends A> {
    private List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }
}
