package JavaHTPE11.ch_20_generic_classes_and_methods.ex2_genericMethod;

public class GenericMethodTest {
    public static void main(String[] args) {
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

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

}
