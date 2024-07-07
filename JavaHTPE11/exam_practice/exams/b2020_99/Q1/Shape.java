package JavaHTPE11.exam_practice.exams.b2020_99.Q1;

import java.awt.*;

public abstract class Shape implements Comparable<Shape> {
    private static int count = 0;
    private Point p1;
    private Point p2;

    public Shape(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        count++;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


    @Override
    public int compareTo(Shape s) {
        double d1 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double d2 = Math.sqrt(Math.pow(s.p1.x - s.p2.x, 2) + Math.pow(s.p1.y - s.p2.y, 2));
        return (int) (d1 - d2);

    }

    public abstract void draw(Graphics g);

    public static int getCount() {
        return count;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        count--;
//        super.finalize();
//    }
}

