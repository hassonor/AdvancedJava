package JavaHTPE11.exam_practice.review.generics.T25;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MultiMap<String, Integer> map = new MultiMap<String, Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        map.put("aa", arr);
        System.out.println(map.get("aa"));
        map.add("aa", 3);
        System.out.println(map.get("aa"));


    }
}
