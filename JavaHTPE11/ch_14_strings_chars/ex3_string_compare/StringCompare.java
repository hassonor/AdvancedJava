package JavaHTPE11.ch_14_strings_chars.ex3_string_compare;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy Birthday";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        // test for equality
        if (s1.equals("hello")) { // true
            System.out.println("s1 equals \"hello\"");
        } else {
            System.out.println("s1 does not equal \"hello\"");
        }

        // test for equality with ==
        if (s1 == "hello") { // false; they are no the same object
            System.out.println("s1 is the same object as \"hello\"");
        } else {
            System.out.println("s1 is not the same object as \"hello\"");
        }

        // test for equality (ignore case)
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println(s3 + " equals " + s4 + " with case ignored");
        } else {
            System.out.println("s3 does not equal s4");
        }

        // test compareTo
        System.out.println("s1.compareTo(s2) is " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s1) is " + s2.compareTo(s1));
        System.out.println("s1.compareTo(s1) is " + s1.compareTo(s1));
        System.out.println("s3.compareTo(s4) is " + s3.compareTo(s4));
        System.out.println("s4.compareTo(s3) is " + s4.compareTo(s3));

        System.out.println();

        // test regionMatches (case-sensitive)
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match");
        } else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }

        // test regionMatches (ignore case)
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        } else {
            System.out.println("First 5 characters of s3 and s4 do not match");
        }

    }
}
