package JavaHTPE11.exam_practice.exams.b2021_98.Q3;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends A> {
    private List<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T t) {
        list.add(t);
    }

}
