package JavaHTPE11.ch_14_strings_chars.ex11_StringBuilder_capacity_setLength_ensureCapacity;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.println("buffer = " + buffer.toString());
        System.out.println("length = " + buffer.length());
        System.out.println("capacity = " + buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.println("New capacity = " + buffer.capacity());

        buffer.setLength(10);
        System.out.println("New length = " + buffer.length());
        System.out.println("buffer = " + buffer.toString());

    }
}
