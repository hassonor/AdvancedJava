package JavaHTPE11.exam_practice.exams.b2021_74.Q1.B;

public abstract class A implements Cloneable {
    private int[] nums = {1,2,3,4};
    public A(){ init(nums);}

//    public abstract void init(int[] nums);

    public void init(int[] nums){
        System.out.println("A.init");
        this.nums = nums;
    }
    public void inc(){
        for(int i = 0; i < nums.length;i++){
            nums[i] = nums[i] +1;
        }
    }

    public String toString(){
        return "" + nums[0];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        A a = (A) super.clone();
        a.nums = nums.clone();
        return a;
    }

}
