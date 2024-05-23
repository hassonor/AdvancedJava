package DataStructuresReview.lesson1;

public class ClosestPairDistance {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 5, 9, 14, 20, 3, 4};
        Double[] arr2 = {1.2, 3.5, 8.1, 1.0, 20.9, 12.0};

        System.out.println("Closest Pair Distance in arr1: " + closestPairDistance(arr1));
        System.out.printf("Closest Pair Distance in arr2: %.2f  ", closestPairDistance(arr2));
    }


    /**
     * This method calculates the smallest distance between any two numbers in the given array.
     * Time Complexity: O(n^2)
     * The method contains a nested loop, where the outer loop runs n times (for each element in the array),
     * and the inner loop runs approximately n-1 times (for each pair of elements), resulting in a total
     * time complexity of O(n * (n-1)) which simplifies to O(n^2).
     * <p>
     * Space Complexity: O(1)
     * The method uses a constant amount of extra space, primarily for storing the minimum distance.
     * No additional space is used that scales with the input size, so the space complexity is O(1).
     *
     * @param arr the input array of numbers
     * @return the smallest distance between any two numbers in the array
     */

    private static <T extends Number> double closestPairDistance(T[] arr) {
        if (arr.length < 2) return 0.0;
        double res = Math.abs(arr[1].doubleValue() - arr[0].doubleValue());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double temp = Math.abs(arr[i].doubleValue() - arr[j].doubleValue());
                if (temp < res) res = temp;
            }
        }
        return res;
    }
}
