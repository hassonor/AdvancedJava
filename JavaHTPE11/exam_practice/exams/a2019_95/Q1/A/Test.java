package JavaHTPE11.exam_practice.exams.a2019_95.Q1.A;

public class Test {
    public static void exTest(int num) throws Exception {
        try {
            switch (num) {
                case 0:
                    throw new ExceptionA("zero");
                case 1:
                    throw new ExceptionB("one");
                case 2:
                    throw new ExceptionC("two");
                case 3:
                    throw new RuntimeException("three");
            }
        } catch (ExceptionA e) {
            System.out.println("caught in A ");
            throw e;
        } catch (ExceptionC e) {
            System.out.println("caught in C ");
            throw e;
        } catch (ExceptionB e) {
            System.out.println("caught in B ");
        } finally {
            System.out.println("finally in method");
        }
        System.out.println("method completed");
    }

    public static void main(String[] args) {
        try {
            Test t = new Test();
            exTest(0);
//            exTest(1);
//            exTest(2);
//            exTest(3);
//            exTest(4);
        } catch (ExceptionB e) {
            System.out.println("B caught in main");
        } catch (Exception e) {
            System.out.println("Exception caught in main");
        } finally {
            System.out.println("finally in main");
        }
        System.out.println("main completed");
    }
}
