package JavaHTPE11.exam_practice.exams.b2022_89.Q1;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Location))
            return false;
        Location l = (Location) o;
        return l.x == x && l.y == y;
    }
}
