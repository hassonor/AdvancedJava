package JavaHTPE11.ch_14_strings_chars.ex7_string_concatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Happy";
        String s2 = " Birthday";

        System.out.println("s1 = " + s1 + "\n" + "s2 = " + s2.trim());

        System.out.println("Result of s1.concat(s2) = " + s1.concat(s2));
        System.out.println("s1 after concatenation = " + s1);
    }
}
