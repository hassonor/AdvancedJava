package JavaHTPE11.exam_practice.exams.a2019_86.Q1;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

public class App2 extends App1 {
    private String st = "";

    public App2(int n, String st) throws IllegalDataException {
        super();
        if (n < 0)
            throw new IllegalDataException();

        for (int i = 0; i < n; i++) {
            super.apply();
        }
        this.st = st;
    }

    public App2(String st) {
        this.st = st;
    }

    public void apply() {
        super.apply();
        if (st.length() > 0)
            st = st.substring(1);
    }

    public String toString() {
        return st;
    }

    public boolean equals(Object o) {
        System.out.print("in App2 ");
        if (!(o instanceof Applyable)) return false;
        else if ((o instanceof App2))
            return (((App2) o).st.equals(st));
        else if ((o instanceof App1))
            return (((App1) o).getNum()) == st.length();
        else
            return false;
    }
}
