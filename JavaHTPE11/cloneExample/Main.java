package JavaHTPE11.cloneExample;

public class Main {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x);

        Y y = new Y();
        System.out.println(y);

        Z z = new Z();
        System.out.println("z = " + z);
        try {
            X x1 = (X) x.clone();
            System.out.println(x1);
            Y y1 = (Y) y.clone();
            System.out.println(y1);

            Z z1 = (Z) z.clone();
            System.out.println("z1 = " + z1);
            z.xObj.x = 0;
            System.out.println("z = " + z);
            System.out.println("z1 = " + z1);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error");
        }

    }
}
