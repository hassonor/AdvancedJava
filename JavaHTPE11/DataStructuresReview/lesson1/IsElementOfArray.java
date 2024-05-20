package JavaHTPE11.DataStructuresReview.lesson1;


public class IsElementOfArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 54, 64, 3, 2, 1};
        System.out.println(isItemOnArray(arr, 67));
        System.out.println(isItemOnArray(arr, 3));

        String[] arr2 = {"a", "hello", "sup", "israel", "some", "will", "power"};
        System.out.println(isItemOnArray(arr2, "ab"));
        System.out.println(isItemOnArray(arr2, "israel"));
    }

    // This method checks if an item exists in an array.
    // Time Complexity: O(N) - The method potentially checks each element in the array once.
    // Space Complexity: O(1) - No additional space is used that scales with input size.
    private static <T> boolean isItemOnArray(T[] array, T item) {
        for (T t : array) {
            if (t.equals(item)) return true;
        }
        return false;
    }
}
