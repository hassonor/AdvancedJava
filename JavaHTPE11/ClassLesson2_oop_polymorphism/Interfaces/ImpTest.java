package JavaHTPE11.ClassLesson2_oop_polymorphism.Interfaces;

public interface ImpTest {
    int MyConst = 500;


    void methodA();

     default void methodB(){};

    static boolean methodStaticD(){
        System.out.println("methodStaticD");
        return true;
    }
}