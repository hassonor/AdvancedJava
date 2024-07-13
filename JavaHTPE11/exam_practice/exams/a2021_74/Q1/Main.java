package JavaHTPE11.exam_practice.exams.a2021_74.Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Building> arr = new ArrayList<Building>();
        arr.add(new Building(2, 3, 4));
        arr.add(new Cinema(2, 3, 4, 100));
        arr.add(new Cinema(2, 3, 4, 233));
    }

    private static Cinema maxCinema(ArrayList<Building> arr) {
        Cinema c = null;

        for (Building b : arr) {
            if (b instanceof Cinema) {
                Cinema temp = (Cinema) b;
                if (c == null)
                    c = temp;
                else {
                    if (c.compareTo(temp) < 0)
                        c = temp;
                }
            }
        }

        return c;
    }

}

