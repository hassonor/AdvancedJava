package JavaHTPE11.exam_practice.review.generics.T2;

import java.util.HashMap;
import java.util.Map;

public class AreaShape {
    public interface Shape {
        public int getArea();
    }

    public static <T extends Shape> String getBiggestAreaShape(HashMap<String, T> hm) {
        Map.Entry<String, T> e = null;

        for (Map.Entry<String, T> rec : hm.entrySet()) {
            if (e == null) {
                e = rec;
            } else {
                if (e.getValue().getArea() < rec.getValue().getArea())
                    e = rec;
            }
        }

        return e.getKey();
    }

    public static String getBiggestAreaShapeWildCard(HashMap<String, ? extends Shape> hm) {
        Map.Entry<String, ? extends Shape> e = null;

        for (Map.Entry<String, ? extends Shape> rec : hm.entrySet()) {
            if (e == null) {
                e = rec;
            } else {
                if (e.getValue().getArea() < rec.getValue().getArea())
                    e = rec;
            }
        }

        return e.getKey();
    }


}

