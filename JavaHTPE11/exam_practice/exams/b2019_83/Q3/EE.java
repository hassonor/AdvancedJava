package JavaHTPE11.exam_practice.exams.b2019_83.Q3;

import java.util.HashSet;
import java.util.Set;

public class EE {
    public void ee1(Set<Number> x) {
    }

    public void ee2(HashSet<Number> x) {
    }

    public void ee3(Set<Float> x) {
    }

    public void ee4(HashSet<Float> x) {
    }

    public void test() {
        Set<Number> sn = null;
        Set<Float> sf = null;
        HashSet<Number> hsn = null;
        HashSet<Float> hsf = null;
//        ee1(sf); // ! Compilation Error
        ee1(hsn);
//        ee2(sn);  // ! Compilation Error
//        ee3(sn); // ! Compilation Error

    }
}
