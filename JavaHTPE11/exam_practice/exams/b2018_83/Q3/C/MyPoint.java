package JavaHTPE11.exam_practice.exams.b2018_83.Q3.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPoint implements Comparable<MyPoint> {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public int compareTo(MyPoint other) {
        return Integer.compare(this.x, other.x);
    }

    public static void main(String[] args) {
        List<MyPoint> points = new ArrayList<MyPoint>();
        points.add(new MyPoint(1, 3));
        points.add(new MyPoint(2, 1));
        points.add(new MyPoint(3, 2));
        Collections.sort(points, new Comparator<MyPoint>() {
            public int compare(MyPoint p1, MyPoint p2) {
                return Integer.compare(p1.y, p2.y);
            }
        });

        System.out.println(points);
    }
}


