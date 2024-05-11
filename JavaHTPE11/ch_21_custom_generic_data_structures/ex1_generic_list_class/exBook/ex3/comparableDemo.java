package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex3;

public class comparableDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, -4};
        System.out.println(max(arr));
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) return null;
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) max = array[i];
        }
        return max;
    }
}
