package JavaHTPE11.ch_14_strings_chars.ex9_string_valueOf;

public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // L suffix indicates long
        float floatValue = 2.5f; // f indicates that 2.5 is a float
        double doubleValue = 33.3333; // no suffix, double is default
        Object objectRef = "hello"; // assign string to an Object reference

        System.out.println("char array = " + String.valueOf(charArray));
        System.out.println("part of char array = " + String.valueOf(charArray, 3, 3));
        System.out.println("boolean = " + String.valueOf(booleanValue));
        System.out.println("int = " + String.valueOf(integerValue));
        System.out.println("long = " + String.valueOf(longValue));
        System.out.println("float = " + String.valueOf(floatValue));
        System.out.println("double = " + String.valueOf(doubleValue));
        System.out.println("Object = " + String.valueOf(objectRef));
    }
}
