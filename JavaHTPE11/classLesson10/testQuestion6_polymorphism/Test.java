package JavaHTPE11.classLesson10.testQuestion6_polymorphism;

public class Test {
    private int a,b;

    private static int c = 7;

    public Test(int a){
        this.a = a;
    }



    public static void main(String[] args){
        Test t = new Test(2);
        System.out.println(t.b);
    }
}
