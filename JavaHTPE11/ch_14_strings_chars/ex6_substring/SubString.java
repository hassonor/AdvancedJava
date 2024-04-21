package JavaHTPE11.ch_14_strings_chars.ex6_substring;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        // test substring methods
        System.out.println("Substring from index 20 to end is: " + letters.substring(20));
        System.out.println("Substring from index 3 up to , but not including, 6 is " + letters.substring(3, 6));
    }
}
