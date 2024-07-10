package JavaHTPE11.exam_practice.exams.b2019_84.Q1.A;

public class AA {
    public static void bar(XX x, int j) {
        System.out.print(x.foo(j));
    }

    public static void main(String[] args) {
        bar(new XX() {
            @Override
            public int foo(int i) {
                return i++;
            }
        }, 4);
    }
}
