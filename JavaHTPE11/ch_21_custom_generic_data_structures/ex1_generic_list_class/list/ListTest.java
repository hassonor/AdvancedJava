package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.list;

import java.util.NoSuchElementException;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        // insert integers in list
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();

        // remove objects from list; print after each removal
        try {
            int removeItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removeItem);
            list.print();

            removeItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removeItem);
            list.print();

            removeItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removeItem);
            list.print();

            removeItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removeItem);
            list.print();
            
        } catch (NoSuchElementException noSuchElementException) {
            noSuchElementException.printStackTrace();
        }
    }
}
