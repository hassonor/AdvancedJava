package JavaHTPE11.ch_4;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("post-incrementing: %d%n", c++);
        System.out.printf("c after postincrement: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf("c before preincrement: %d%n", c);
        System.out.printf("pre-incrementing: %d%n", ++c);
        System.out.printf("c after preincrement: %d%n", c);
    }
}
