package JavaHTPE11.exam_practice.exams.a2019_95.Q3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static Zoo<Bird> birdSplit(Zoo<? extends Animal> zoo) {
        Zoo<Bird> birdZoo = new Zoo<Bird>(new ArrayList<Bird>());
        Iterator<? extends Animal> it = zoo.list().iterator();

        while (it.hasNext()) {
            Animal item = it.next();
            if (item instanceof Bird) {
                birdZoo.add((Bird) item);
            }
        }

        return birdZoo;
    }

}
