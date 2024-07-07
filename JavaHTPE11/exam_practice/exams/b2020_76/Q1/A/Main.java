package JavaHTPE11.exam_practice.exams.b2020_76.Q1.A;

public class Main {
    public static void main(String[] args) {
        Computeable a = new Data(3);
        Data b = new Data(3);
        Data c = new Data(3);

        System.out.println(a.equals(b)); // false
        System.out.println(b.equals(a)); // false
        System.out.println(b.equals(c)); // Data\n true

        Computeable a1 = new Data(2);
        Data b1 = new Data(3);
        b1.comp();
        if (((Data) a1).getNum() == b1.getNum())
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        Computeable x = new Data(2);
        Data y = new Data(2);
        System.out.println("x == y " + x.equals(y)); // x == y true
        System.out.println("y == x " + y.equals(x)); // y == x true

    }
}
