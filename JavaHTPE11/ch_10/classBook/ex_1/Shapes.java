package JavaHTPE11.ch_10.classBook.ex_1;

public class Shapes {
    public static void main(String[] args) {
        Circle[] shapes = new Circle[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Cylinder();
        shapes[2] = new Cylinder(0.0, 0.0, 2.0, 1.0);
        for (Circle shape : shapes) {
            System.out.println("area= " + shape.area());
            if (shape instanceof Cylinder)
                System.out.println("volume=" + ((Cylinder) shape).volume());
        }
    }
}
