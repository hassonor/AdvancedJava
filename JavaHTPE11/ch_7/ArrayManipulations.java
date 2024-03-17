package JavaHTPE11.ch_7;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.4, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArrray:");

        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        }

        // fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        int[] intArray = {7, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];

        // copy array intArray into array intArrayCopy
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArrayCopy.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        // compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));

        // search intArray for the value 5
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        // search intArray for the value 8763
        location = Arrays.binarySearch(intArray, 8763);

        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }

    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
