package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion6;

public class C {
    private int i;
    private static int j;

    public C(int x) {
        this.i = x;
    }

    void print1() {
        System.out.println(i + ", " + j);
    }

    void print2() {
        System.out.println(i + "," + j);
    }

    public static void main(String[] args) {
        int k;
        C x = new C(5);
        // System.out.println(i); // Compilation Error!
        System.out.println(j);
//  System.out.println(k); // Compilation Error!
//        System.out.println(x.i);
        System.out.println(C.j);

    }
}
