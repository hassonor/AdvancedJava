package JavaHTPE11.exam_practice.exams.b2020_76.Q1.B;


public class Main {
    public static void main(String[] args) {
        try {
            Pair p1 = new Pair(1, 2);
            Pair p2 = (Pair) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
