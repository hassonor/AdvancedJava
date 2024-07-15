package JavaHTPE11.exam_practice.exams.a2024_89.Q3;

import java.util.ArrayList;

public class Convertor implements GenTrasformable<ArrayList<String>, Integer> {


    @Override
    public Integer transform(ArrayList<String> arg) throws Exception {
        int sum = 0;
        for (String s : arg) {
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                throw new Exception();
            }
        }

        return sum;

    }
}
