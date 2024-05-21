package JavaHTPE11.DataStructuresReview.lesson1;

public class MaxElementOnSquareMatrix {
    public static void main(String[] args) {
        // Test case with Integer matrix where elements are not sorted
        Integer[][] intMatrixUnsorted = {
                {9, 2, 3},
                {4, 1, 6},
                {7, 8, 5}
        };

        // Test case with Double matrix where elements are not sorted
        Double[][] doubleMatrixUnsorted = {
                {5.5, 2.2, 9.9},
                {4.4, 1.1, 3.3},
                {7.7, 6.6, 8.8}
        };

        // Find and print the maximum element in the unsorted Integer matrix
        System.out.println("Max element in intMatrixUnsorted: " + maxElementsOnSquareMatrix(intMatrixUnsorted));

        // Find and print the maximum element in the unsorted Double matrix
        System.out.println("Max element in doubleMatrixUnsorted: " + maxElementsOnSquareMatrix(doubleMatrixUnsorted));

        // Additional test case with negative values and mixed order
        Integer[][] intMatrixMixed = {
                {-1, -2, -3},
                {-4, 0, -6},
                {-7, -8, -5}
        };


        // Find and print the maximum element in the mixed order Integer matrix
        System.out.println("Max element in intMatrixMixed: " + maxElementsOnSquareMatrix(intMatrixMixed));
        
    }

    /**
     * This method finds the maximum element in a square matrix.
     * Time Complexity: O(n^2)
     * The method contains a nested loop that iterates through all elements of the matrix.
     * If the matrix is of size n x n, there are n^2 elements, leading to a time complexity of O(n^2).
     * Space Complexity: O(1)
     * The method uses a constant amount of extra space to store the maximum element found so far.
     * No additional space is used that scales with the input size, so the space complexity is O(1).
     *
     * @param matrix the input square matrix
     * @return the maximum element in the matrix
     */
    private static <T extends Number & Comparable<T>> T maxElementsOnSquareMatrix(T[][] matrix) {
        // Initialize max with the first element of the matrix
        T max = matrix[0][0];

        // Iterate through each element in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                T temp = matrix[i][j];
                // Update max if the current element is greater
                if (temp.compareTo(max) > 0) {
                    max = temp;
                }
            }
        }

        return max;
    }
}
