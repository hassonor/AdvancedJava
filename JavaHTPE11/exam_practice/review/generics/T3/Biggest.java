package JavaHTPE11.exam_practice.review.generics.T3;


public class Biggest {
    public static <T extends Comparable<T> & Lookup<T>> T biggest(Integer id, GenTable<T> table1, GenTable<T> table2) {
        T one = table1.find(id);
        T two = table2.find(id);
        if (one == null && two != null)
            return two;
        else if (one != null && two == null)
            return one;
        else if (one.compareTo(two) >= 0)
            return one;
        else if (two.compareTo(one) > 0)
            return two;

        return null;
    }

}

