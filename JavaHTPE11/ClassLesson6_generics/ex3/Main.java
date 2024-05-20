package JavaHTPE11.ClassLesson6_generics.ex3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<Integer>();
        p1.setFirst(44);
        p1.setSecond(33);
        System.out.println(p1.getFirst());
//		
        //Pair <Double> p2 = new Pair<Double>();
//        Pair<Boolean> p2 = new Pair<Boolean>();
        //Pair <Student> p2 = new Pair<Student>();

    }

}
