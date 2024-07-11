package JavaHTPE11.exam_practice.review.generics.T21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Grep {

    public static <K extends Comparable<K>, V> HashMap<K, V> grep(HashMap<K, V> hm, K key) {
        HashMap<K, V> hm2 = new HashMap<K, V>();
        Iterator<Map.Entry<K, V>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<K, V> rec = it.next();
            if (rec.getKey().compareTo(key) > 0)
                hm2.put(rec.getKey(), rec.getValue());
        }

        return hm2;
    }

}

