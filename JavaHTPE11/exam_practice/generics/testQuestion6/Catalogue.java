package JavaHTPE11.exam_practice.generics.testQuestion6;

import java.util.Collection;
import java.util.HashMap;

public class Catalogue<T extends Item> {
    HashMap<String, T> hm;

    public Catalogue() {
        hm = new HashMap<String, T>();
    }

    public void add(T item) {
        hm.put(item.getSerialNo(), item);
    }

    public T get(String serialNo) {
        return hm.get(serialNo);
    }

    public Collection<T> list() {
        return hm.values();
    }
}
