package JavaHTPE11.exam_practice.review.generics.T14;


import java.util.Iterator;

public class Main {
    public static <T extends Item> Catalogue<ThickItem> getThickItems(Catalogue<T> cat) {
        Catalogue<ThickItem> thicks = new Catalogue<ThickItem>();

        Iterator<T> it = cat.list().iterator();

        while (it.hasNext()) {
            T next = it.next();
            if (next instanceof ThickItem)
                thicks.add((ThickItem) next);
        }

        return thicks;

    }

}
