package JavaHTPE11.ch_20_generic_classes_and_methods.ex5_wildcards;

import java.util.ArrayList;
import java.util.List;

public class TotalNumbers {
    public static void main(String[] args) {
        // create, initialize and output List of Numbers containing
        // both Integers and Doubles, then display total of the elements
        Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
        List<Number> numberList = new ArrayList<>();

        for (Number element : numbers) {
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    // calculate total of List elements
    public static double sum(List<Number> list) {
        double total = 0;

        for (Number number : list) {
            total += number.doubleValue();
        }

        return total;
    }
}
