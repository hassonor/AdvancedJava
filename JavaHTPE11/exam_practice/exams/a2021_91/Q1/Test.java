package JavaHTPE11.exam_practice.exams.a2021_91.Q1;

public class Test {
    public static void main(String[] args) {
//        Applyable a = new Conc();
//        Conc b = new Conc();
//        a.apply();
//        b.apply();
//        System.out.println("first= " + a.equals(b));
//        System.out.println("second= " + b.equals(a));

//        Conc a1 = new Conc();
//        Applyable b1 = new Conc();
//        a1.calc();a1.apply();
//        b1.apply();b1.calc();

//        Applyable a = new Conc();
//        Applyable b = new Conc2("hi");
//        a.apply();
//        b.apply();
//        System.out.println("first= " + a.equals(b));
//        System.out.println("second= " + b.equals(a));

        Conc a1 = new Conc2("abc");
        int len = (a1.toString()).length();
        for (int i = 0; i < len; i++) {
            ((Conc) a1).apply();
            System.out.println("result=  " + a1);
        }
    }
}
