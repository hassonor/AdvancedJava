package JavaHTPE11.exam_practice.exams.b2021_74.Q1.B;

public class B extends A{
    public B() { System.out.println("B.constructor");}

    public void init(int[] nums){
        System.out.println("B.init");
        nums = new int[4];
        for(int i = 0; i < nums.length;i++)
            nums[i] = i;
    }

    public static void main(String[] args){
        System.out.println(new B());

        try{
            B b1 = new B();
            B b2 = (B) b1.clone();

            System.out.println("Original: " + b1); // Should print the initial value of the first element in the array
            System.out.println("Clone: " + b2);    // Should print the same initial value of the first element in the array

            b1.inc();
            System.out.println("After incrementing original:");
            System.out.println("Original: " + b1); // Should print the incremented value of the first element in the array
            System.out.println("Clone: " + b2);    // Should print the initial value, showing that the arrays are separate

        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
