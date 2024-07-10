package JavaHTPE11.exam_practice.review.generics.T13;

import java.util.Iterator;

public class Main {
    public static <T extends Dish> Menu<Cake> getCakes(Menu<T> mn) {
        Menu<Cake> cakes = new Menu<Cake>();
        Iterator<T> it = mn.iterator();

        while (it.hasNext()) {
            T next = it.next();
            if (next instanceof Cake)
                cakes.add((Cake) next);
        }

        return cakes;
    }

}
