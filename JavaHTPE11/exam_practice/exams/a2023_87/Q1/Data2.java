package JavaHTPE11.exam_practice.exams.a2023_87.Q1;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

public class Data2 extends Data {
    private String st = "";

    public Data2(String st) {
        this.st = st;
    }

    public Data2(int num) throws IllegalDataException {
        if (num < 0 || num > 100)
            throw new IllegalDataException();
        super.apply();
        super.apply(num);

    }

    public void apply(int n) {
        if (st.length() >= n)
            st = st.substring(n);
    }

    public String toString() {
        return st + getNum();
    }


    public boolean equals(Object o) {
        if (!(o instanceof MMM)) return false;
        else if ((o instanceof Data2))
            return (((Data2) o)).st.equals(st);
        else if ((o instanceof Data))
            return (((Data) o).getNum()) == st.length();
        else
            return false;
    }
}
