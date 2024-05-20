package JavaHTPE11.ClassLesson6_generics.ex7;

public class MainClass {
    static <T, V extends T> boolean isIn(V x, T[] y) {
        for (T t : y) {
            if (x.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("2 is in nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("7 is not in nums");
        }

        // Use isIn() on Strings.
        String[] strs = {"one", "two", "three", "four", "five"};


        if (isIn("two", strs))//o(1)
            System.out.println("two is in strs");

        if (!isIn("seven", strs))
            System.out.println("seven is not in strs");

    }
}