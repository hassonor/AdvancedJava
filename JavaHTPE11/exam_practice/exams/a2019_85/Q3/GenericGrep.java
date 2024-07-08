package JavaHTPE11.exam_practice.exams.a2019_85.Q3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericGrep {
    public static <K extends Comparable<K>, V> HashMap<K, V> grep(HashMap<K, V> hm, K key) {
        HashMap<K, V> hm2 = new HashMap<K, V>();
        Iterator<Map.Entry<K, V>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<K, V> item = it.next();
            if (item.getKey().compareTo(key) > 0)
                hm2.put(item.getKey(), item.getValue());
        }

        return hm2;

    }

}
