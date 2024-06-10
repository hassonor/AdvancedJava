package JavaHTPE11.ClassLesson2_oop_polymorphism.ex_3.secondPackage;

import JavaHTPE11.ClassLesson2_oop_polymorphism.ex_3.firstPackage.A;

public class E {
    public E() {
//        _x1 = 0; No access
//        _x2 = 0; No access
//        _x3 = 0; No access
//        _x4 = 0; No access

        A a = new A();
//        a._x1 = 0; No access, it's private
//        a._x2 = 0; No access, not in the same package
        a._x3 = 0;
//          a._x4 = 0; // No access, A doesn't extend itself
        
    }
}
