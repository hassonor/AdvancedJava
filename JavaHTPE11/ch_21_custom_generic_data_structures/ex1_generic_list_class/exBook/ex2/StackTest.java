package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex2;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(10);

        integerStack.push(5);
        Integer num = integerStack.pop();
        System.out.println(num);

        Stack<Integer> cpStack = Stack.copy(integerStack);
    }


}
