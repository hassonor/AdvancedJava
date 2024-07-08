package JavaHTPE11.exam_practice.exams.a2019_95.Q3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Zoo<T extends Animal> {
    private HashMap<Integer, T> hm;

    public Zoo(ArrayList<T> arr) {
        hm = new HashMap<Integer, T>();
        for (int i = 0; i < arr.size(); i++) {
            hm.put(arr.get(i).getId(), arr.get(i));
        }
    }

    public void add(T item) {
        hm.put(item.getId(), item);
    }

    public T get(int id) {
        return hm.get(id);
    }

    public boolean remove(int id) {
        if (get(id) == null)
            return false;
        else {
            hm.remove(id);
            return true;
        }
    }

    public ArrayList<T> list() {
        ArrayList<T> arr = new ArrayList<T>();
        Collection<T> col = hm.values();
        Iterator<T> it = col.iterator();
        while (it.hasNext()) {
            T item = it.next();
            arr.add(item);
        }
        return arr;
    }
}
