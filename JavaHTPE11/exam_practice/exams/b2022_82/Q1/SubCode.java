package JavaHTPE11.exam_practice.exams.b2022_82.Q1;

public class SubCode extends Code {
    private char[] data;

    public SubCode() {
        this("xyz");
    }

    public SubCode(String s) {
        super.s = s;
        data = s.toCharArray();
    }

    public void reEncode() {
        super.encode();
        System.out.println("reEncode");
        data[0] = s.charAt(0);
        data[data.length - 1] = s.charAt(s.length() - 1);
    }
}
