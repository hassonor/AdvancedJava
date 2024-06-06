package JavaHTPE11.classLesson10.testQuestion_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main<T> {
    public static void main(String[] args){
        try {
            // Test with a sorted Integer list
            ArrayList<Integer> intListSorted = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("intListSorted is sorted: " + isSorted(intListSorted));

            // Test with an unsorted Integer list
            ArrayList<Integer> intListUnsorted = new ArrayList<>(Arrays.asList(5, 3, 4, 1, 2));
            System.out.println("intListUnsorted is sorted: " + isSorted(intListUnsorted));

            // Test with a sorted String list
            ArrayList<String> strListSorted = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
            System.out.println("strListSorted is sorted: " + isSorted(strListSorted));

            // Test with an unsorted String list
            ArrayList<String> strListUnsorted = new ArrayList<>(Arrays.asList("cherry", "banana", "apple"));
            System.out.println("strListUnsorted is sorted: " + isSorted(strListUnsorted));

            // Test with an empty list
            ArrayList<String> emptyList = new ArrayList<>();
            try {
                System.out.println("emptyList is sorted: " + isSorted(emptyList));
            } catch (IllegalDataException e) {
                System.out.println("emptyList: " + e.getMessage());
            }

            // Test with a null list
            ArrayList<String> nullList = null;
            try {
                System.out.println("nullList is sorted: " + isSorted(nullList));
            } catch (IllegalDataException e) {
                System.out.println("nullList: " + e.getMessage());
            }

        } catch (IllegalDataException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> arr) throws IllegalDataException {
        if(arr == null  || arr.isEmpty())
            throw new IllegalDataException();

        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i).compareTo(arr.get(i+1)) > 0)
                return false;
        }
        return true;
    }
}
