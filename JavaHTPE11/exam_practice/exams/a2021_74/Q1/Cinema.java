package JavaHTPE11.exam_practice.exams.a2021_74.Q1;

public class Cinema extends Building {
    private int places;

    public Cinema(double l, double w, int f, int places) {
        super(l, w, f);

        this.places = places;
    }

    @Override
    public int compareTo(Building b) throws RuntimeException {
        if (!(b instanceof Cinema))
            throw new RuntimeException();

        return places - ((Cinema) b).places;
    }

    public int getPlaces() {
        return places;
    }
}
