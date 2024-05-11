package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex2;

import JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex1.Shape;
import JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex1.Square;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(10);

        integerStack.push(5);
        Integer num = integerStack.pop();
        System.out.println(num);

        Stack<Integer> cpStack = Stack.copy(integerStack);

        Stack<Square> squareStack = new Stack<>(10);
        Stack<Shape> shapeStack = new Stack<>(10);
        Stack.drawShapes(squareStack);
        Stack.drawShapes(shapeStack);
    }


}
