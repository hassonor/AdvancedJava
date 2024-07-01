package JavaHTPE11.exam_practice.exams.b2022_82.Q1;

public class Code {
    protected String s;

    public Code(String s) throws Exception {
        if (s.length() < 2 || s.length() > 20)
            throw new Exception();
        this.s = s;
    }

    public Code() {
    }


    public String toString() {
        return s;
    }

    public void encode() {
        System.out.println("Code encode");
        s = s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
    }

    public void decode() {
        encode();
    }
}

