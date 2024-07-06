package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q1;

public class SimpleCode extends Code {
    private String str;

    public SimpleCode(String str) {
        this.str = str;
    }

    @Override
    public String eval() {
        return str;
    }

}
