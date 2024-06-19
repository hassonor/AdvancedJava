package JavaHTPE11.ClassLesson11_test_questions.testQuestion2_generics.a;

import java.util.ArrayList;

public class EvalImg implements Evaluateble<String> {
    @Override
    public String evaluate(ArrayList<String> x) {
        String s = "";
        for (String str : x) {
            s += str;
        }
        return s;
    }
}
