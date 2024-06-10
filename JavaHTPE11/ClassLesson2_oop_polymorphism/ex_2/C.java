package JavaHTPE11.ClassLesson2_oop_polymorphism.ex_2;

public class C {
    public C() {
//        _x1 = 0; no access it's private
//        _x2 = 0; no access it's not class variable
//        _x3 = 0; no access it's not class variable
//        _x4 = 0; no access it's not class variable
        A a = new A();
//        a._x1 = 0; no access it's private
        a._x2 = 0;
        a._x3 = 0;
        a._x4 = 0;
    }
}
