package JavaHTPE11.ClassLesson6_generics.ex6;

class ArrayAlg {
    public static <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }

    // exercise complete (and fix) the following function
    public static <M extends Comparable<M>> M getMax(M[] arr) {
        M max = arr[0];
        for (M m : arr) {
            if (m.compareTo(max) > 0)
                max = m;
        }
        return max;


    }

    public void stam() {
        System.out.println("bla bla");
    }

    //
    private int _stamX = 42;


}