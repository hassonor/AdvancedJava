package JavaHTPE11.exam_practice.exams.b2018_82.Q3;

import java.util.*;

public class MultiMap<K, V> implements Map<K, Collection<V>> {
    private Map<K, Collection<V>> map;

    public MultiMap() {
        this.map = new HashMap<K, Collection<V>>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for (Collection<V> collection : map.values()) {
            if (collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<V> get(Object key) {
        return map.get(key);
    }

    @Override
    public Collection<V> put(K key, Collection<V> value) {
        return map.put(key, value);
    }

    public void add(K key, V value) {
        Collection<V> values = map.get(key);
        if (values == null) {
            values = new ArrayList<V>();
            map.put(key, values);
        }
        values.add(value);
    }

    @Override
    public Collection<V> remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends Collection<V>> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<Collection<V>> values() {
        return map.values();
    }

    @Override
    public Set<Entry<K, Collection<V>>> entrySet() {
        return map.entrySet();
    }

    public static void main(String[] args) {
        MultiMap<String, Integer> map = new MultiMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        map.put("aa", arr);
        System.out.println(map.get("aa")); // Output: [1, 2]
        map.add("aa", 3);
        System.out.println(map.get("aa")); // Output: [1, 2, 3]
    }
}