package JavaHTPE11.ClassLesson2_oop_polymorphism.Polymorphism;

public class StamMain {
    public static void stamObj(Object o) {
        System.out.println("o.hashCode()" + o.hashCode());
    }

    public static void main(String[] args) {
        Employee e = new Employee("roy");
        System.out.println(e.toString());
        stamObj(e);
        Integer i = 88;
        stamObj(i);
        int j = 99;
        stamObj(j);
    }

}
