package JavaHTPE11.ClassLesson6_generics.ex8;

class GenericClass {
    private double val;

    public <T extends Number> GenericClass(T arg) {
        val = arg.doubleValue();
    }

    // public  GenericClass(Number arg) {
//	    val = arg.doubleValue();
//	  }
    void showValue() {
        System.out.println("val: " + val);
    }
}

public class MainClass {
    public static void main(String args[]) {

        float f = (float) 4.4;
        GenericClass test = new GenericClass(100);
        GenericClass test2 = new GenericClass(123.5F);
        GenericClass test3 = new GenericClass(f);
        test.showValue();
        test2.showValue();
    }
}