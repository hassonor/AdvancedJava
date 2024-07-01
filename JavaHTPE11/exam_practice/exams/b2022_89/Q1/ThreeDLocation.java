package JavaHTPE11.exam_practice.exams.b2022_89.Q1;

public class ThreeDLocation extends Location {
    private double z;

    public ThreeDLocation(int x, int y, double z) throws Exception {
        super(x, y);
        if (z < 0)
            throw new Exception();
        this.z = z;
    }

    public ThreeDLocation() throws Exception {
        this(0, 0, 0);
    }

}
