package JavaHTPE11.exam_practice.exams.b2018_83.Q3.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MultiMap<K, V> extends HashMap<K, Collection<V>> {

    public MultiMap() {
        super();
    }

    @Override
    public Collection<V> put(K key, Collection<V> value) {
        return super.put(key, value);
    }


    public void add(K k, V v) {
        Collection<V> values = this.get(k);
        if (values == null) {
            values = new ArrayList<V>();
            this.put(k, values);
        }
        values.add(v);

    }


}
