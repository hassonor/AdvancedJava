package JavaHTPE11.ClassLesson2_oop_polymorphism.inner_outer;

public class Outer2 {
    private int x = 10;

    void test(){
        x = 111;
        System.out.println("Outer test invoked:" +  x);
    }
    public class Inner{
        void test(){
            x = 777;
            System.out.println("Inner test invoked:" +  x);
            System.out.println("Outer2.this test() invoked");
            Outer2.this.test();
        }


    }
}
