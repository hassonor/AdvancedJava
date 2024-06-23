package JavaHTPE11.exam_practice.generics.testQuestion5;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Menu<? extends Desert> arr1 = new Menu<Desert>();
        Menu<Cake> arr2 = new Menu<Cake>();

        arr1 = arr2;

    }

    private static <T extends Dish> Menu<Cake> getCakes(Menu<T> m) {
        Menu<Cake> cakes = new Menu<Cake>();
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (next instanceof Cake)
                cakes.add((Cake) next);
        }
        return cakes;
    }
}
