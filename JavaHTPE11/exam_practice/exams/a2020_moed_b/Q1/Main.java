package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Code c1 = new SimpleCode("abc");
        Code c2 = new SimpleCode("bxaxy");
        UnionCode uc = new UnionCode(c1, c2);
        System.out.println(uc.eval());

        Code code1 = new SimpleCode("abc");
        Code code2 = new SimpleCode("def");
        Code code3 = new SimpleCode("ghi");

        ArrayList<Code> codes = new ArrayList<>();
        codes.add(code1);
        codes.add(code2);
        codes.add(code3);

        UnionCode result = test(codes);
        System.out.println(result.eval());
    }

    public static UnionCode test(ArrayList<Code> codes) {

        Code combinedCode = codes.get(0);
        for (int i = 1; i < codes.size(); i++) {
            combinedCode = new UnionCode(combinedCode, codes.get(i));
        }
        return (UnionCode) combinedCode;
    }
}


