package JavaHTPE11.ClassLesson6_generics.ex6;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 33, 4, 1, 2, 3, 4, 88, 9};
        System.out.println(ArrayAlg.getMiddle(arr));
        System.out.println(ArrayAlg.getMax(arr));
        Student[] arr2 = {new Student(), new Student(), new Student(), new Student(), new Student(), new Student(), new Student(), new Student(), new Student(), new Student()};
        System.out.println(ArrayAlg.getMiddle(arr2));
        //System.out.println(ArrayAlg.getMax(arr2));
    }

}
