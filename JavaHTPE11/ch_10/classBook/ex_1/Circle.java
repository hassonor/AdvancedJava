package JavaHTPE11.ch_10.classBook.ex_1;

public class Circle {
    protected double x, y;
    protected double r;
    protected static final double PI = Math.PI;

    public Circle() {
        this(0.0, 0.0, 1.0);
    }

    public Circle(double r) {
        x = 0.0;
        y = 0.0;
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double circumference() {
        return 2 * PI * r;
    }

    public double area() {
        return PI * r * r;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Circle)) return false;
        else {
            Circle c = (Circle) obj;
            return c.x == x && c.y == y && c.r == r;
        }
    }

    @Override
    public String toString() {
        return "center=(" + x + "," + y + ")" + "radius =" + r;
    }
}
