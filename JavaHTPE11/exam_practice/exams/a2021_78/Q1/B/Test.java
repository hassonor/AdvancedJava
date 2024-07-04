package JavaHTPE11.exam_practice.exams.a2021_78.Q1.B;

public class Test {
    private Integer num;

    public Test(int num) {
        if (num > 0) this.num = num;
    }

    public Test() {
        this(0);
    }

    public void a() throws Exception {
        try {
            if (num.intValue() > 0) {
                System.out.println("num  = " + num.intValue());
                throw new Exception();
            }
            System.out.println("executing a ");
        } catch (Exception e) {
            System.out.println("exception caught in a");
            throw e;
        } finally {
            System.out.println("finally in a");
        }
        System.out.println("end of a ");
    }


//    public static void main(String[] args) {
//        try {
//            Test t1 = new Test(10);
//            t1.a();
//        } catch (NullPointerException e) {
//            System.out.println("exception caught in code");
//        } catch (Exception e) {
//        }
//        System.out.println("end Code");
//    }

    public static void main(String[] args) throws Exception {
        try {
            Test t2 = new Test();
            t2.a();
        } catch (NullPointerException e) {
            System.out.println("exception caught in code");
        }
    }
}
