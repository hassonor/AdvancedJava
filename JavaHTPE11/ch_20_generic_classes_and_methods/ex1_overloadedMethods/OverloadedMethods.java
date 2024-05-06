package JavaHTPE11.ch_20_generic_classes_and_methods.ex1_overloadedMethods;

public class OverloadedMethods {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.print("Array integerArray contains: ");
        printArray(integerArray);
        System.out.print("Array doubleArray contains: ");
        printArray(doubleArray);
        System.out.print("Array characterArray contains: ");
        printArray(characterArray);
    }

    // method printArray to print Integer array
    public static void printArray(Integer[] inputArray) {
        // display array elements
        for (Integer element : inputArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // method printArray to print Double array
    public static void printArray(Double[] inputArray) {
        // display array elements
        for (Double element : inputArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    // method printArray to print Character array
    public static void printArray(Character[] inputArray) {
        // display array elements
        for (Character element : inputArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
