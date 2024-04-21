package JavaHTPE11.ch_14_strings_chars.ex2_string_miscellaneous;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.println("s1: " + s1);

        // test length method
        System.out.println("Length of s1: " + s1.length());

        // loop through characters in s1 with charAt and display reversed
        System.out.print("The string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.print(s1.charAt(count));
        }

        System.out.println();

        // copy characters from string into charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.print("The character array is: ");

        for (char character : charArray) {
            System.out.print(character);
        }

        System.out.println();


    }
}
