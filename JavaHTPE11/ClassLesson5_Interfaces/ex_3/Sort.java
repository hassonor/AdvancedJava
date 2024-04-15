package JavaHTPE11.ClassLesson5_Interfaces.ex_3;

public class Sort {
    public static void sortBub(Comparable[] arr) {
        Comparable temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }


}
