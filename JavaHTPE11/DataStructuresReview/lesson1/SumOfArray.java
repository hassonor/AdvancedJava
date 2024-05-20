package JavaHTPE11.DataStructuresReview.lesson1;


public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr));
    }

    // This method calculates the sum of all elements in an array.
    // Time Complexity - O(N): The method iterates through each element of the array exactly once.
    // Space Complexity - O(1): The method uses a constant amount of extra space (an integer variable).
    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
