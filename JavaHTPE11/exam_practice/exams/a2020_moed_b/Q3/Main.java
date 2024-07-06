package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q3;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Catalogue<? extends Item> myCatalogue;
        myCatalogue = new Catalogue<ThickItem>();
        myCatalogue = new Catalogue<LiquidItem>();
        myCatalogue = new Catalogue<SolidItem>();

        Catalogue<? extends ThickItem> thick = new Catalogue<ThickItem>();
        Catalogue<LiquidItem> liquid = new Catalogue<LiquidItem>();
        thick = liquid;

    }

    public static <T extends Item> Catalogue<ThickItem> getThickItems(Catalogue<T> cat) {

        Catalogue<ThickItem> ti = new Catalogue<ThickItem>();
        Iterator<T> it = cat.list().iterator();

        while (it.hasNext()) {
            T item = it.next();
            if (item instanceof ThickItem) {
                ti.add((ThickItem) item);
            }
        }

        return ti;
    }

}
