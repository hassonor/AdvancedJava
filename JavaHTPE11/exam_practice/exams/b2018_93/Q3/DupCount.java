package JavaHTPE11.exam_practice.exams.b2018_93.Q3;

import java.util.HashMap;

public class DupCount<T> {
    private HashMap<T, Integer> hm;

    public DupCount() {
        hm = new HashMap<T, Integer>();
    }

    public void add(T item) {
        int count = get(item);
        count++;
        hm.put(item, count);
    }

    public int remove(T item) {
        int count = get(item);
        if (count == 1) {
            hm.remove(item);
        } else if (count > 1) {
            count--;
            hm.put(item, count);
            return count;
        }

        return 0;
    }

    public int get(T item) {
        if (hm.containsKey(item)) {
            return hm.get(item);
        } else {
            return 0;
        }
    }

}
