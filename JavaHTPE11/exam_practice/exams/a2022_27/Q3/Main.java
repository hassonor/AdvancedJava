package JavaHTPE11.exam_practice.exams.a2022_27.Q3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Codeable<?> data1 = null;
        Codeable<Object> data2 = null;
        Codeable<Text> data3 = null;

//        codeTest(data1); ! Compilation Error
        codeTest(data2);
//        codeTest(data3); ! Compilation Error
    }

    public static void codeTest(Codeable<Object> data) {
    }

    public static <T extends Codeable<T>> ArrayList<T> coder(ArrayList<T> arr) {
        ArrayList<T> arr2 = new ArrayList<T>();

        for (T item : arr) {
            try {
                arr2.add(item.code());
            } catch (NonCodeable e) {
                arr2.add(item);
            }
        }

        return arr2;
    }

}
