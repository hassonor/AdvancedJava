package JavaHTPE11.ClassLesson2_oop_polymorphism.inner_outer;

public class Main {

    public static void main(String[] args){
        Outer.Inner f = new Outer.Inner();
        Outer f2 = new Outer();
        System.out.println(Outer.y);
        System.out.println(Outer.Inner.y);

        Outer2 outer2 = new Outer2();
        Outer2.Inner in;
        in = outer2.new Inner();
        in.test();
        outer2.test();
    }

}
