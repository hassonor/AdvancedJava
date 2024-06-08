package JavaHTPE11.classLesson10.testQuestion2;

public class B extends A {
    public static void main(String[] args){
        A a = new A();
        A ab = new B();
        B b = new B();

        System.out.println((b instanceof A) + ", "); // true
        System.out.println((a instanceof B) + ", ");  // false
        System.out.println((a.getClass() == ab.getClass()) + ", "); // false
        System.out.println(b.getClass() == ab.getClass()); // true
    }
}
