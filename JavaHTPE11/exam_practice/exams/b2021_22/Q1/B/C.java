package JavaHTPE11.exam_practice.exams.b2021_22.Q1.B;

public class C {

    public static void main(String[] args) {

    }

    private static B sum(A[] aArr, B[] bArr) throws Exception {
        int sum = 0;
        String str = "";
        for (A item : aArr) {
            sum += item.getN();
        }
        for (B item : bArr) {
            sum += item.getN();
            str += item;
        }


        return new B(sum, str);
    }
}
