package JavaHTPE11.exam_practice.exams.random;

public class Data implements Cloneable {
    private int[] nums;

    public Data(int size, int val) {
        nums = new int[size];
        for (int i = 0; i < size; i++)
            nums[i] = val;
    }

    public void set(int index, int val) {
        if (index >= 0 && index < nums.length)
            nums[index] = val;
    }

    public int get(int index) throws Exception {
        if (index >= 0 && index < nums.length)
            return nums[index];
        else throw new Exception();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Data d = (Data) super.clone();
        d.nums = nums.clone();
        return d;
    }

}
