package JavaHTPE11.ch_14_strings_chars.ex15_static_char_methds;

public class StaticCharMethods {
    public static void main(String[] args) {
        char charForTest = 'A';

        // display character info
        System.out.println("is defined: " + Character.isDefined(charForTest));
        System.out.println("is digit: " + Character.isDigit(charForTest));
        System.out.println("is first character in a Java identified: " + Character.isJavaIdentifierStart(charForTest));
        System.out.println("is part of a Java identified: " + Character.isJavaIdentifierPart(charForTest));
        System.out.println("is letter: " + Character.isLetter(charForTest));
        System.out.println("is letter or digit: " + Character.isLetterOrDigit(charForTest));
        System.out.println("is lower case: " + Character.isLowerCase(charForTest));
        System.out.println("is upper case: " + Character.isUpperCase(charForTest));
        System.out.println("to upper case: " + Character.toUpperCase(charForTest));
        System.out.println("to lower case: " + Character.toLowerCase(charForTest));
    }
}
