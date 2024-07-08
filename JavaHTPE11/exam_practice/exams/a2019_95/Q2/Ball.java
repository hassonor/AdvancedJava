package JavaHTPE11.exam_practice.exams.a2019_95.Q2;

public class Ball {
    private int x, y;
    private int dx, dy;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        if (Math.random() > 0.5) dx = 1;
        else dx = -1;
        if (Math.random() > 0.5) dy = 1;
        else dy = -1;
    }

    public void move() {
        x = x + dx * 10;
        y = y + dy * 10;
    }
}
