package JavaHTPE11.ch_21_custom_generic_data_structures.ex1_generic_list_class.exBook;

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        Shape ans = max(shapes);
        System.out.println(ans);
        
    }

    private static <T extends Shape> T max(T[] shapes) {
        T max = null;
        if (shapes.length > 0) max = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > max.getArea()) max = shapes[i];
        }

        return max;
    }
}
