package JavaHTPE11.ch_14_strings_chars.ex4_string_start_end;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        // test method startsWith
        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.println(string + " starts with \"st\"");
            }
        }

        // test method startsWith starting from position 2 of string
        for (String string : strings) {
            if (string.startsWith("art", 2)) {
                System.out.println(string + " starts with \"art\" at position 2");
            }
        }

        // test method endsWith
        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.println(string + " ends with \"ed\"");
            }
        }
    }
}
