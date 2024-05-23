package DataStructuresReview.lesson3;

import java.util.Stack;

/**
 * This class provides a method to insert values into a stack such that the stack remains sorted.
 */
public class InsertValuesSortedToStack {

    /**
     * The main method to test the insertion of values into a sorted stack.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Stack<Integer> sortedStack = new Stack<>();
        int[] arr = {4, 12, 3, 5, 8, 4, 0, -4, 100, 9};
        sortIntStack(sortedStack, arr);

        System.out.println(sortedStack);
    }

    /**
     * Sorts the given array of integers and inserts them into the stack in sorted order.
     *
     * @param stack the stack into which the integers are to be inserted in sorted order
     * @param arr   the array of integers to be sorted and inserted into the stack
     *              <p>
     *              The time complexity of this method is O(n^2), where n is the number of elements in the array.
     *              This is because, for each element, we may need to move it across the entire stack.
     *              The space complexity is O(n), where n is the number of elements in the array,
     *              due to the auxiliary stack used for sorting.
     */
    private static void sortIntStack(Stack<Integer> stack, int[] arr) {
        Stack<Integer> helperStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > arr[i]) {
                    helperStack.push(stack.pop());
                }
                stack.push(arr[i]);
                while (!helperStack.isEmpty()) {
                    stack.push(helperStack.pop());
                }
            }
        }
    }
}
