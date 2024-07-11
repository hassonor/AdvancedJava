package JavaHTPE11.exam_practice.review.generics.T20;

import java.util.ArrayList;

public class BirdSplit {
    public static Zoo<Bird> birdSplit(Zoo<? extends Animal> zoo) {
        Zoo<Bird> birds = new Zoo<Bird>(null);
        ArrayList<? extends Animal> arr = zoo.list();
        for (Animal animal : arr) {
            if (animal instanceof Bird) {
                birds.add((Bird) animal);
            }
        }

        return birds;

    }

}
