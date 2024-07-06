package JavaHTPE11.exam_practice.exams.b2020_73.Q1.C;

public class B extends A {

    public void foo(int i) {
        System.out.println("in foo B");
    }

    @Override
    public String toString() {
        return "class B";
    }

    public static void main(String[] args) {
        System.out.println(new B());
    }
}
