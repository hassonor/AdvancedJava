package JavaHTPE11.exam_practice.exams.b2020_99.Q1;

import java.awt.*;

public class Rect extends Shape {

    public Rect(Point leftUp, Point rightDown) {
        super(leftUp, rightDown);
    }

    @Override
    public void draw(Graphics g) {

    }

//    @Override
//    public void draw(GraphicsContext gc) {
//        double x = getP1().getX();
//        double y = getP1().getY();
//        double width = getP2().getX() - x;
//        double height = getP2().getY() - y;
//        gc.strokeRect(x, y, width, height);
//    }

}

