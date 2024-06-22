package JavaHTPE11.exam_practice.generics.testQuestion6;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Item> Catalogue<ThickItem> getThickItem(Catalogue<T> cat) {
        Catalogue<ThickItem> tis = new Catalogue<ThickItem>();
        Iterator<T> it = cat.list().iterator();

        while (it.hasNext()) {
            T next = it.next();
            if (next instanceof ThickItem)
                tis.add((ThickItem) next);
        }

        return tis;
    }
}
