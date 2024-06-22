package JavaHTPE11.exam_practice.generics.testQuestion4;

import java.util.ArrayList;

public class EvalImg implements Evaluateable<String> {


    @Override
    public String evaluate(ArrayList<String> arr) {
        String str = "";
        for (String s : arr) {
            str += s;
        }

        return str;
    }
}
