package JavaHTPE11.exam_practice.exams.a2021_74.Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Building> arr = new ArrayList<Building>();
        arr.add(new Building(2, 3, 4));
        arr.add(new Cinema(2, 3, 4, 100));
    }

    private static Cinema maxCinema(ArrayList<Building> arr) {
        int maxPlaces = -1;
        Cinema c = null;

        for (Building b : arr) {
            if (b instanceof Cinema) {
                Cinema temp = (Cinema) b;
                if (temp.getPlaces() > maxPlaces) {
                    maxPlaces = temp.getPlaces();
                    c = temp;
                }
            }
        }

        return c;
    }

}

