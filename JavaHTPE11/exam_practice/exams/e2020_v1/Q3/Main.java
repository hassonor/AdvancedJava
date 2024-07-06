package JavaHTPE11.exam_practice.exams.e2020_v1.Q3;

import java.util.Iterator;

public class Main {
    public static <T extends Dish> Menu<Cake> getCakes(Menu<T> mn) {
        Menu<Cake> ck = new Menu<Cake>();

        Iterator<T> it = mn.iterator();

        while (it.hasNext()) {
            T item = it.next();
            if (item instanceof Cake)
                ck.add((Cake) item);
        }

        return ck;
    }

}
