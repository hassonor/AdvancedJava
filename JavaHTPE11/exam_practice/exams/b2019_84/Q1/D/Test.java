package JavaHTPE11.exam_practice.exams.b2019_84.Q1.D;

public class Test {
    public static void work(Data d) {
    }

    public static void main(String[] args) {
        Data d1 = new Data(3);
        Data d2 = new Data(3);
        Data d3 = d2;
        work(d2);
        System.out.print(d1.equals(d2) + ",");
        System.out.print(d3.equals(d2));
    }
}
