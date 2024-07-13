package JavaHTPE11.exam_practice.review.generics.T28;

import java.util.ArrayList;

public class EvalImp implements Evaluateable<String> {


    @Override
    public String evaluate(ArrayList<String> x) {
        String str = "";
        for (String s : x) {
            str += s;
        }

        return str;
    }
}

