package JavaHTPE11.exam_practice.exams.b2018_83.Q1;

public class G extends E {
    public G(int i) {
        this();
        System.out.print("G" + i);
    }

    public G() {
        System.out.print("G");
    }

    public static void main(String[] args) {
        E g = new G(0);
    }

}
