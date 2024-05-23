package DataStructuresReview.lesson2;


import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalancedBrackets("{([({(())})])}")); // True
        System.out.println(isBalancedBrackets("{[(])}")); // False
        System.out.println(isBalancedBrackets("{[()]}")); // True
        System.out.println(isBalancedBrackets("{[}")); // False
        System.out.println(isBalancedBrackets("{{{{")); // False
        System.out.println(isBalancedBrackets("}}}}")); // False
        System.out.println(isBalancedBrackets("()[]{}")); // True
        System.out.println(isBalancedBrackets("")); // True
    }

    /**
     * Checks if the given string has balanced brackets.
     * Time Complexity: O(n)
     * The function iterates through each character of the string exactly once,
     * where 'n' is the length of the string. Each push and pop operation on the stack
     * takes O(1) time, so the overall time complexity is O(n).
     * <p>
     * Space Complexity: O(n)
     * In the worst case, if all characters in the string are opening brackets,
     * the stack will store all 'n' characters. Therefore, the space complexity
     * is O(n).
     *
     * @param str the input string containing brackets
     * @return true if the brackets are balanced, false otherwise
     */
    private static boolean isBalancedBrackets(String str) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                myStack.push(str.charAt(i));
            } else {
                if (myStack.isEmpty())
                    return false;
                char temp = myStack.pop();
                if ((ch == '}' && temp != '{') ||
                        (ch == ']' && temp != '[') ||
                        (ch == ')' && temp != '(')) {
                    return false;
                }
            }
        }

        return myStack.isEmpty();

    }
}
