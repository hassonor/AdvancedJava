package JavaHTPE11.exam_practice.exams.b2020_73.Q2;

//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//
//public class XShape extends Shape {
//    private int x;
//    private int y;
//    private int size;
//
//    public XShape(int x, int y, int size) throws InvalidException {
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
//        // Set stroke color
//        gc.setStroke(Color.BLACK);
//
//        // Draw the first line of the X
//        gc.strokeLine(x, y, x + size, y + size);
//
//        // Draw the second line of the X
//        gc.strokeLine(x + size, y, x, y + size);
//    }
//}