package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q1;

public class UnionCode extends ComplexCode {

    public UnionCode(Code c1, Code c2) {
        super(c1, c2);
    }

    @Override
    public String eval() {
        String first = getCode1().eval();
        String second = getCode2().eval();
        String str = "" + first;

        for (int i = 0; i < second.length(); i++) {
            if (first.indexOf(second.charAt(i)) == -1)
                str += second.charAt(i);
        }

        return str;
    }

}
