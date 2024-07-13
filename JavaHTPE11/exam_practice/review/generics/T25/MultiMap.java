package JavaHTPE11.exam_practice.review.generics.T25;

import java.util.*;

public class MultiMap<K, V> implements Map<K, Collection<V>> {
    private HashMap<K, Collection<V>> hm;

    public MultiMap() {
        hm = new HashMap<K, Collection<V>>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Collection<V> get(Object key) {
        return hm.get(key);
    }

    @Override
    public Collection<V> put(K key, Collection<V> value) {
        return hm.put(key, value);
    }

    public void add(K key, V value) {
        Collection<V> values = get(key);
        if (values == null) {
            values = new ArrayList<V>();
            hm.put(key, values);
        }
        values.add(value);
    }

    @Override
    public Collection<V> remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends Collection<V>> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<Collection<V>> values() {
        return null;
    }

    @Override
    public Set<Entry<K, Collection<V>>> entrySet() {
        return null;
    }

}

