package JavaHTPE11.exam_practice.review.generics.T20;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo<T extends Animal> {
    private HashMap<Integer, T> hm;

    public Zoo(ArrayList<T> animals) {
        hm = new HashMap<Integer, T>();
        for (T item : animals) {
            hm.put(item.getId(), item);
        }
    }

    public void add(T animal) {
        hm.put(animal.getId(), animal);
    }

    public T get(int id) {
        return hm.get(id);
    }

    public boolean remove(int id) {
        if (get(id) != null) {
            hm.remove(id);
            return true;
        }

        return false;
    }

    public ArrayList<T> list() {
        ArrayList<T> arr = new ArrayList<T>(hm.values());
        return arr;
    }
}
