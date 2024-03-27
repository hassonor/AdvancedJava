package JavaHTPE11.ClassLesson2.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //Employee e = new Employee();
        Hourly h = new Hourly("roy1", 5555, 4444);
        Employee e = new Hourly("roy2", 5555, 4444);
        Employee ee = new Employee("roy");
        System.out.println(h.pay());
        System.out.println(e.pay());
        System.out.println(ee.pay());
        //System.out.println(h.minSal());
    }

}
