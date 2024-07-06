package JavaHTPE11.exam_practice.exams.b2020_73.Q2;
//
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//
//public class Triangle extends Shape {
//    private int x;
//    private int y;
//    private int size;
//
//    public Triangle(int x, int y, int size) throws InvalidException {
//        if (x < 0 || y < 0) {
//            throw new InvalidException("Coordinates x and y must be non-negative");
//        }
//        if (size <= 0) {
//            throw new IllegalArgumentException("Size must be positive");
//        }
//        this.x = x;
//        this.y = y;
//        this.size = size;
//    }
//
//    @Override
//    public void draw(GraphicsContext gc) throws InvalidException {
//        if (gc == null) {
//            throw new InvalidException("GraphicsContext cannot be null");
//        }
//
//        double height = (Math.sqrt(3) / 2) * size;
//        double[] xPoints = {x, x + size / 2, x - size / 2};
//        double[] yPoints = {y, y + height, y + height};
//
//        gc.setStroke(Color.BLACK);
//        gc.strokePolygon(xPoints, yPoints, 3);
//    }
//}
