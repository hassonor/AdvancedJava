package JavaHTPE11.ClassLesson5_Interfaces.ex_1;

public class Test {

    public static void stam(ICalc c) {
        System.out.println("Bla Bla Bla...");
        c.calc(12, 12);
    }

    public static void main(String[] args) {
        ICalc[] arr = new ICalc[4];
        //ICalc c = new ICalc();
        arr[0] = new A();
        arr[1] = new B();
        arr[2] = new C();
        arr[3] = new D();
        //arr[4] = new E();
//		arr[4] = new Stam();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i].calc(i, j));
                stam(arr[i]);
            }

        }


    }


}
