package JavaHTPE11.exam_practice.exams.b2021_22.Q1.A;

public class Test {
    private Integer num;

    public Test(int i){
        if(i > 0) num = Integer.valueOf(i);
        System.out.println("Test constructor " + num.intValue());
    }

    public void check() throws Exception {
        System.out.println("executing check " + num);
        try{
            if(num.intValue() > 10)
                    throw new Exception();
        }
        catch(Exception e){
            System.out.println("ex caught in check");
            throw e;
        }
        finally {
            System.out.println("finally in check");
        }

        System.out.println("end of check ");
    }

    public static void main(String[] args){
        try{
//            Test t1 = new Test(10);
//            t1.check();
//            Test t2 = new Test(11);
//            t2.check();
              Test t3 = new Test(0);
              t3.check();
        }
        catch(Exception e){
            System.out.println("ex caught in main");
        }
    }
}
