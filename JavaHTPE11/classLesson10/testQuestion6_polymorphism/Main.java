package JavaHTPE11.classLesson10.testQuestion6_polymorphism;

public class Main {
    public static void main(String[] args){
        A a1 = new A(2);
        A a2 = new A(2);
        Object a3 = a1;

        System.out.println(a1.equals((Object)a1)); // "111" true
        System.out.println(a1.equals(a2)); // "222" false
        System.out.println(a1.equals(a3)); // "111" true
        System.out.println(a3.equals(a3)); // "111" true
        System.out.println(a3.equals(a2)); // "111" false
    }
}
