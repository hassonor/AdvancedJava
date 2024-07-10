package JavaHTPE11.exam_practice.exams.a2018_93.Q3;

import java.util.ArrayList;

public class EvalImp implements Evaluateble<String> {


    @Override
    public String evaluate(ArrayList<String> x) {
        String str = "";
        for (String s : x) {
            str += s;
        }

        return str;
    }
}

