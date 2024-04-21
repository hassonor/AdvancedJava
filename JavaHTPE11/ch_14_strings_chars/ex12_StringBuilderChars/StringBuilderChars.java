package JavaHTPE11.ch_14_strings_chars.ex12_StringBuilderChars;

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");

        System.out.println("buffer = " + buffer.toString());
        System.out.println("Character at 0: " + buffer.charAt(0) + "\nCharacter at 4: " + buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("The characters are: ");
        for (char character : charArray) {
            System.out.print(character);
        }
        System.out.println();

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.println("buffer = " + buffer.toString());

        buffer.reverse();
        System.out.println("buffer = " + buffer.toString());
    }
}
