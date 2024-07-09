package JavaHTPE11.exam_practice.exams.a2018_83.Q1.B;

import java.util.Arrays;

public class MyClass {
    public static void func(int[] arr1, int[] arr2) {
        if (arr1 == arr2) {
            arr1[0] = 10;
        }
        arr1 = new int[]{3, 3, 3};
        if (arr1 != arr2) {
            arr1[2] = 10;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 1};
        int[] arr2 = arr1;
        func(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }
}
