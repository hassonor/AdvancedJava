package leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> symVal = new HashMap<>();
        symVal.put('I', 1);
        symVal.put('V', 5);
        symVal.put('X', 10);
        symVal.put('L', 50);
        symVal.put('C', 100);
        symVal.put('D', 500);
        symVal.put('M', 1000);

        int sum = symVal.get(s.charAt(s.length() - 1));
        ;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (symVal.get(s.charAt(i)) < symVal.get(s.charAt(i + 1))) {
                sum -= symVal.get(s.charAt(i));
            } else {
                sum += symVal.get(s.charAt(i));
            }
        }

        return sum;
    }
}
