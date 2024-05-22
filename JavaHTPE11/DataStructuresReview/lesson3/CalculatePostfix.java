package JavaHTPE11.DataStructuresReview.lesson3;

import java.util.Stack;

public class CalculatePostfix {
    public static void main(String[] args) {
        String expression = "573/*27*-";
        if (isValidPostfix(expression)) {
            System.out.println(calcPostFix(expression));
        } else {
            System.out.println("Invalid postfix expression");
        }
    }

    /**
     * Calculate the result of a postfix expression.
     * Time Complexity: O(n)
     * - The function processes each character of the string exactly once.
     * - Each operation (push, pop, arithmetic) takes constant time O(1).
     * - Therefore, the overall time complexity is O(n), where n is the length of the string.
     * <p>
     * Space Complexity: O(n)
     * - The space complexity is O(n) because, in the worst case, the stack could store all digits from the string.
     * - Each digit is pushed onto the stack, and in the worst case, the stack size could be equal to the number of digits.
     *
     * @param str the postfix expression
     * @return the result of the expression
     * @throws IllegalArgumentException if the expression is invalid
     */
    private static double calcPostFix(String str) {
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression");
                }
                double numTwo = stack.pop();
                double numOne = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(numOne + numTwo);
                        break;
                    case '-':
                        stack.push(numOne - numTwo);
                        break;
                    case '/':
                        stack.push(numOne / numTwo);
                        break;
                    case '*':
                        stack.push(numOne * numTwo);
                        break;
                }
            } else if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } else {
                throw new IllegalArgumentException("Invalid character in postfix expression");
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        return stack.peek();
    }

    /**
     * Validate if a string is a valid postfix expression.
     *
     * @param str the string to validate
     * @return true if the string is a valid postfix expression, false otherwise
     */
    private static boolean isValidPostfix(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                count--;
                if (count < 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return count == 1;
    }

}
