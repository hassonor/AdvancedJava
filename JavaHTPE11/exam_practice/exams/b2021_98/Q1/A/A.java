package JavaHTPE11.exam_practice.exams.b2021_98.Q1.A;

public class A {
    public String st = "A";

    public String getString() {
        return st;
    }

    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();
        B bb = new B();
        System.out.print(aa.st);
        System.out.print(ab.st);
        System.out.print(bb.st);
        System.out.print(aa.getString());
        System.out.print(ab.getString());
        System.out.println(bb.getString());
    }


}
