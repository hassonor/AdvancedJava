package JavaHTPE11.exam_practice.exams.b2018_83.Q3.B;

import java.util.HashSet;

public class EE {
    public static int val = 0;

    @Override
    public int hashCode() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (val != ((EE) obj).val)
            return false;
        return true;
    }

    public static void main(String[] args) {
        HashSet<EE> set = new HashSet<EE>();
        set.add(new EE());
        set.add(new EE());
        EE e = new EE();
        set.add(e);
        System.out.print(set.size());
        System.out.print(" " + set.contains(new EE()));
        System.out.print(" " + set.contains(e));
    }
}
