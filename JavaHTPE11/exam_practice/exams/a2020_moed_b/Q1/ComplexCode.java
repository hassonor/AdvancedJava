package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q1;

public abstract class ComplexCode extends Code {
    private Code c1;
    private Code c2;

    public ComplexCode(Code c1, Code c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Code getCode1() {
        return c1;
    }

    public Code getCode2() {
        return c2;
    }


}
