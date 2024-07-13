package JavaHTPE11.exam_practice.review.generics.T24;

import java.util.ArrayList;

public class MyList<T> extends ArrayList<T> implements Swappable<MyList<T>> {


    @Override
    public void swap(MyList<T> other) {
        MyList<T> temp = new MyList<T>();
        temp.addAll(other);
        other.clear();
        other.addAll(this);
        this.clear();
        this.addAll(temp);
    }
}

