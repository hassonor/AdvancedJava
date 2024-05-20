package JavaHTPE11.DataStructuresReview.lesson1;


// Time Complexity - O(N)
// Space Complexity - O(1)
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr));
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}
