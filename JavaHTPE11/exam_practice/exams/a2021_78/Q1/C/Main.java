package JavaHTPE11.exam_practice.exams.a2021_78.Q1.C;

public class Main {
    public static void main(String[] args) {

    }

    public static B sumAll(A[] a, B[] b) throws Exception {
        int sum = 0;
        String str = "";

        for (A item : a) {
            sum += item.getN();
        }

        for (B item : b) {
            str += item.getText();
        }

        str = sum + str;

        return new B(str);
    }
}
