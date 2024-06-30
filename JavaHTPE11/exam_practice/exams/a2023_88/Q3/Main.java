package JavaHTPE11.exam_practice.exams.a2023_88.Q3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public interface Shape {
        public int getArea();
    }

    public static <V extends Shape> String maxArea(HashMap<String, V> hm) {
        Map.Entry<String, V> rec = null;

        Iterator<Map.Entry<String, V>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, V> temp = it.next();
            if (rec == null)
                rec = temp;
            else if (temp.getValue().getArea() > rec.getValue().getArea()) {
                rec = temp;
            }
        }

        return rec.getKey();

    }

    public static String maxAreaWildcard(HashMap<String, ? extends Shape> hm) {
        Map.Entry<String, ? extends Shape> rec = null;
        for (Map.Entry<String, ? extends Shape> entry : hm.entrySet()) {
            if (rec == null)
                rec = entry;
            else if (entry.getValue().getArea() > rec.getValue().getArea())
                rec = entry;
        }

        return rec.getKey();
    }
}
