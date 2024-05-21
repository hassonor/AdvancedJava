package JavaHTPE11.ClassLesson6_generics.test_94.q3_1;

public class Main {
    public static void stamFriday(Shape s) {
    }

    public static void test(Function<? extends Shape, ? extends Shape> f) {
        //Shape s = f.transform(new Circle());

    }

    public static void main(String[] args) {
        Function<Shape, Shape> f1 = null;
        Function<Shape, Circle> f2 = null;
        Function<Square, Square> f3 = null;
        test(f1);
        test(f2);//?
        test(f3);//?
        stamFriday(new Circle());
    }

}
