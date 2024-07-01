package JavaHTPE11.exam_practice.exams.a2022_24.Q3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Grep {

    public static <K extends Comparable<K>, V> HashMap<K, V> grep(HashMap<K, V> hm, K item) {
        HashMap<K, V> hm2 = new HashMap<K, V>();
        Iterator<Map.Entry<K, V>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<K, V> rec = it.next();
            if (rec.getKey().compareTo(item) > 0)
                hm2.put(rec.getKey(), rec.getValue());
        }

        return hm2;

    }
}
