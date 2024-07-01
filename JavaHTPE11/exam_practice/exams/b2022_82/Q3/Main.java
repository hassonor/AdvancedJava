package JavaHTPE11.exam_practice.exams.b2022_82.Q3;

public class Main {

    public static <T extends Comparable<T> & GenLookUp<T>> T smallest(GenTable<T> table1, GenTable<T> table2, int id) {

        T itemOne = table1.find(id);
        T itemTwo = table2.find(id);

        if (itemOne == null && itemTwo != null)
            return itemTwo;

        else if (itemTwo == null && itemOne != null)
            return itemOne;

        else if (itemTwo == null && itemOne == null)
            return null;

        if (itemOne.compareTo(itemTwo) < 0)
            return itemOne;

        return itemTwo;


    }
}
