package JavaHTPE11.ClassLesson2_oop_polymorphism.testQuestion;

public class Main {
    public static void main(String[] args) {
        Computeable a = new Data();
        Data b = new Data();
        a.comp();
        b.comp();
        // System.out.println(a.getNum()); // ! Compilation Error
        System.out.println(((Data) a).getNum());
        System.out.println(b.getNum());
    }
}
