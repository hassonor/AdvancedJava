package JavaHTPE11.ClassLesson2_oop_polymorphism;

import JavaHTPE11.ClassLesson2_oop_polymorphism.Interfaces.InhImp;

public class A extends B implements InhImp {
    public int x = 4;


    public void displayConstant() {
        System.out.println("Constant from Interface: " + MyConst);
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodC() {

    }
}
