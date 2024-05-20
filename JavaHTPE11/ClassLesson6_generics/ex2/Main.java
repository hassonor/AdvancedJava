package JavaHTPE11.ClassLesson6_generics.ex2;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>();
        p1.setFirst(44);
        p1.setSecond("33");
        System.out.println(p1.getFirst());
        Pair<Boolean, Boolean> p2 = new Pair<Boolean, Boolean>();
        //p2.setFirst(34);
    }

}
