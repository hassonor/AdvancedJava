package JavaHTPE11.ClassLesson6_generics;

public class Test {


    public static void main(String[] args) {
        // Test with integers
        Integer intOne = 3;
        Integer intTwo = 7;
        Integer intThree = 5;
        System.out.println("Max of " + intOne + ", " + intTwo + ", " + intThree + " is: " + max(intOne, intTwo, intThree));

        // Test with strings
        String strOne = "apple";
        String strTwo = "orange";
        String strThree = "banana";
        System.out.println("Max of \"" + strOne + "\", \"" + strTwo + "\", \"" + strThree + "\" is: " + max(strOne, strTwo, strThree));

        // Test with doubles
        Double dblOne = 3.14;
        Double dblTwo = 2.71;
        Double dblThree = 1.62;
        System.out.println("Max of " + dblOne + ", " + dblTwo + ", " + dblThree + " is: " + max(dblOne, dblTwo, dblThree));
    }

    private static <T extends Comparable<T>> T max(T one, T two, T three) {
        T max;
        if (one.compareTo(two) > 0)
            max = one;
        else
            max = two;
        if (three.compareTo(max) > 0)
            max = three;

        return max;
    }


}
