package JavaHTPE11.ClassLesson2_oop_polymorphism;

import JavaHTPE11.ClassLesson2_oop_polymorphism.Interfaces.ImpTest;
import JavaHTPE11.ClassLesson2_oop_polymorphism.Interfaces.InhImp;

public class Test {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        ImpTest impTest = new ImpTest() {
            @Override
            public void methodA() {
                System.out.println();
            }
        };
        impTest.methodB();
        System.out.println(ImpTest.methodStaticD());

        InhImp inhImpAnon = new InhImp() {
            @Override
            public void methodC() {

            }

            @Override
            public void methodA() {

            }


        };

        inhImpAnon.methodC();

        System.out.println(inhImpAnon instanceof  InhImp);
        System.out.println(inhImpAnon instanceof  ImpTest);

    }
}
