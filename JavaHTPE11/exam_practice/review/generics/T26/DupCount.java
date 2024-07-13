package JavaHTPE11.exam_practice.review.generics.T26;

import java.util.HashMap;

public class DupCount<T> {
    private HashMap<T, Integer> hm;

    public DupCount() {
        hm = new HashMap<T, Integer>();
    }

    public Integer get(T item) {
        return hm.get(item);
    }

    public void add(T item) {
        Integer count = get(item);
        if (count == null) {
            hm.put(item, 1);
        } else {
            count++;
            hm.put(item, count);
        }
    }

    public Integer remove(T item) {
        Integer count = get(item);
        if (count == null) {
            return 0;
        } else if (count == 1) {
            hm.remove(item);
            return 0;
        } else {
            count--;
            hm.put(item, count);
            return count;
        }
    }
}
