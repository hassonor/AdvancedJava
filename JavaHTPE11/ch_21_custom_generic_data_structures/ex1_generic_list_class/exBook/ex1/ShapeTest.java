package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook.ex1;


import JavaHTPE11.ClassLesson5_Interfaces.ex_2.Circle;
import JavaHTPE11.ClassLesson5_Interfaces.ex_2.Point;
import JavaHTPE11.ClassLesson5_Interfaces.ex_2.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Point p = new Point(1, 2);

        Circle[] shapes = {c, c};


        System.out.println(max(shapes));

        Shape c2 = max(shapes);

        Integer[] arr = {1, 2, 3, 4};
        Integer lastInt = last(arr);
        System.out.println(lastInt);

        Double[] arr2 = {1.1, 2.2, 3.3, 4.4};
        Double lastDouble = last(arr2);
        System.out.println(lastDouble);

    }

    private static <T extends Shape> T max(T[] shapeArray) {
        T max = null;
        if (shapeArray.length > 0) max = shapeArray[0];
        for (int i = 1; i < shapeArray.length; i++) {
            if (shapeArray[i].area() > max.area()) max = shapeArray[i];
        }
        return max;
    }

    private static <E> E last(E[] inputArray) {
        E last = null;
        if (inputArray.length > 0) last = inputArray[inputArray.length - 1];
        return last;
    }
}
