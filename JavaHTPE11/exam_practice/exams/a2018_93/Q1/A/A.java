package JavaHTPE11.exam_practice.exams.a2018_93.Q1.A;

public class A {
    private int num = 0;

    public A(int num) {
        this.num = num;
    }

    public boolean equals(Object obj) {
        System.out.println("111");
        num++;
        A a = (A) obj;
        return a.num == num;
    }

    public boolean equals(A a) {
        System.out.println("222");
        return super.equals(a);
    }

    public static void main(String[] args) {
        A a1 = new A(2);
        A a2 = new A(2);
        Object a3 = a1;
        System.out.println(a1.equals((Object) a1)); // 111 true
        System.out.println(a1.equals(a2)); // 222 false
        System.out.println(a1.equals(a3)); // 111 true
        System.out.println(a3.equals(a3)); // 111 true
        System.out.println(a3.equals(a2)); // 111 false
    }
}
