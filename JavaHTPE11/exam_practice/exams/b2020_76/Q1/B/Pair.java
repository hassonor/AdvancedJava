package JavaHTPE11.exam_practice.exams.b2020_76.Q1.B;

public class Pair implements Cloneable {
    private Integer[] nums = new Integer[2];

    public Pair(int a, int b) {
        nums[0] = a;
        nums[1] = b;
    }

    public void inc() {
        nums[0]++;
        nums[1]++;
    }

    public String toString() {
        return "(" + nums[0] + "," + nums[1] + ")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pair p = (Pair) super.clone();
        p.nums = nums.clone();
        return p;
    }
}
