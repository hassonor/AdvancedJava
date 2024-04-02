package JavaHTPE11.ClassLesson2.ex_2;

public class B extends A {
    public B() {
//        _x1 = 0; // No access it's private
        _x2 = 0;
        _x3 = 0;
        _x4 = 0;
        A a = new A();

//        a._x1 = 0; // No access it's private
        a._x2 = 0;
        a._x3 = 0;
        a._x4 = 0;
    }
}
