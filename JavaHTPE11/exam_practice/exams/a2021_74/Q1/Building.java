package JavaHTPE11.exam_practice.exams.a2021_74.Q1;

public class Building implements Comparable<Building> {
    private double length;
    private double width;
    private int numOfFloors;

    public Building(double l, double w, int f) {
        length = 1;
        width = w;
        numOfFloors = f;
    }

    public double area() {
        return length * width * numOfFloors;
    }

    @Override
    public int compareTo(Building b) {
        return (int) (area() - b.area());
    }
}
