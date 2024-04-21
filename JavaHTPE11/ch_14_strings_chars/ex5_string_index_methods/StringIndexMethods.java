package JavaHTPE11.ch_14_strings_chars.ex5_string_index_methods;

public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";

        // test indexOf to locate a character in a string
        System.out.println("'c' is located at index " + letters.indexOf('c'));
        System.out.println("'a' is located at index " + letters.indexOf('a', 1));
        System.out.println("'$' is located at index " + letters.indexOf('$'));

        // test lastIndexOf to find a character in a string
        System.out.println("Last 'c' is located at index " + letters.lastIndexOf('c'));
        System.out.println("Last 'a' is located at index " + letters.lastIndexOf('a', 25));
        System.out.println("Last '$' is located at index " + letters.lastIndexOf('$'));

        // test indexOf to locate a substring in a string
        System.out.println("\"def\" is located at index " + letters.indexOf("def"));
        System.out.println("\"def\" is located at index " + letters.indexOf("def", 7));
        System.out.println("\"def\" is located at index " + letters.indexOf("hello"));

        // test lastIndexOf to find a substring in a string
        System.out.println("Last \"def\" is located at index " + letters.lastIndexOf("def"));
        System.out.println("Last \"def\" is located at index " + letters.lastIndexOf("def", 25));
        System.out.println("Last \"hello\" is located at index " + letters.lastIndexOf("hello"));
    }
}
