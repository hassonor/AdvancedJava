package JavaHTPE11.exam_practice.exams.a2021_91.Q1;

public class Main {
    public static void main(String[] args) {
        try {
            Conc2 conc2 = new Conc2(99);
            System.out.println(conc2.getNum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
