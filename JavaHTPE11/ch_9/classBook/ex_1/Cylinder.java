package JavaHTPE11.ch_9.classBook.ex_1;

public class Cylinder extends Circle {
    protected double h;

    public Cylinder() {
        super();
        h = 1.0;
    }

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public double area() {
        return 2 * super.area() + 2 * PI * r * h;
    }

    public double volume() {
        return super.area() * h;
    }

}
