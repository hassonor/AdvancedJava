package JavaHTPE11.ch_14_strings_chars.ex10_StringBuilder_constructors;

public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");

        System.out.println("buffer1 = " + buffer1);
        System.out.println("buffer2 = " + buffer2);
        System.out.println("buffer3 = " + buffer3);
    }
}
