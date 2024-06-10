package JavaHTPE11.ClassLesson2_oop_polymorphism.ex_3.secondPackage;

import JavaHTPE11.ClassLesson2_oop_polymorphism.ex_3.firstPackage.A;

public class D extends A {
    public D() {
//      _x1 = 0; No access, it's private
//      _x2 = 0; No access, not in the same package
        _x3 = 0;
        _x4 = 0;
        A a = new A();
//      a._x1 = 0; No access, it's private
//      a._x2 = 0; No access, not in the same package
        a._x3 = 0;
//      a._x4 = 0; No A doesn't extends itself
    }
}
