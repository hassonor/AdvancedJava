package JavaHTPE11.ClassLesson5_Interfaces.ex_3;

public class Main {
    public static void main(String[] args) {
        //int arr[] = {1,3,1,1,5,1,6,2,-5};
        //Comparable c = 45;
        Integer[] arr = {1, 3, 1, 1, 5, 1, 6, 2, -5};
        Sort.sortBub(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        Employee[] arr2 = {new Employee("roy", 45), new Employee("roy", 33), new Employee("roy", 22), new Employee("roy", 99), new Employee("roy", 34), new Employee("roy", 65), new Employee("roy", 11)};
        Sort.sortBub(arr2);
    }

}
