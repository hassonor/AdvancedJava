package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q1;

public abstract class Code {
    public abstract String eval();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Code))
            return false;
        Code c = (Code) o;
        return c.eval().equals(eval());
    }
}
