package JavaHTPE11.ch_14_strings_chars.ex8_string_miscellaneous_2;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces   ";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        // test method replace
        System.out.printf(
                "Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

        // test toLowerCase and toUpperCase
        System.out.println("s1.toUpperCase() = " + s1.toUpperCase());
        System.out.println("s2.toLowerCase() = " + s2.toLowerCase());

        // test trim method
        System.out.println("s3 after trim = " + "\"" + s3.trim() + "\"");

        // test toCharArray method
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");

        for (char character : charArray) {
            System.out.print(character);
        }

        System.out.println();
    }
}
