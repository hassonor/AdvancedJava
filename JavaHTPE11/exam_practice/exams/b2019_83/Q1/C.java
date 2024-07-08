package JavaHTPE11.exam_practice.exams.b2019_83.Q1;

public class C {
    private int i;
    static int j;

    void print1() {
        System.out.println(i);
        System.out.println(j);
    }

    static void print2() {
//        System.out.println(i); // ! Compilation Error
        System.out.println(j);
    }

    public static void main(String[] args) {
        int k;
        C x = new C();
//        System.out.println(i); // ! Compilation Error
        System.out.println(j);
//        System.out.println(k); // ! Compilation Error
        System.out.println(x.i);
        System.out.println(x.j);
    }
}
