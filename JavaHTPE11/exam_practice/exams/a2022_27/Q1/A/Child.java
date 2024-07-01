package JavaHTPE11.exam_practice.exams.a2022_27.Q1.A;

public class Child extends Parent {
    // Compilation error
//    protected void func(Parent a) {
//        System.out.println("456");
//    }

    // Compilation error
//    public void func(Parent a) {
//        throw new IOException();
//    }

    // Will Print: "456 456"
//    public void func(Parent a) {
//        System.out.print("456 ");
//    }

    // Will Print "456 123"
//    public void func(Child b) {
//        System.out.print("456 ");
//    }


    // Will Print "123 123"
//    public void func(Object o) {
//        System.out.print("456 ");
//    }

    public static void main(String[] args) {
        Child b = new Child();
        Parent a = new Parent();
        b.func(b);
        b.func(a);
    }
}
