package JavaHTPE11.exam_practice.exams.a2018_87.Q3;

import java.util.ArrayList;

public class MyList<T extends Swappable<T>> extends ArrayList<T> implements Swappable<ArrayList<T>> {

    @Override
    public void swap(ArrayList<T> other) {
        ArrayList<T> temp = new ArrayList<>(other);
        other.clear();
        other.addAll(this);
        this.clear();
        this.addAll(temp);
    }
}
