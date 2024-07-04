package JavaHTPE11.exam_practice.exams.a2021_91.Q1;

public class Conc2 extends Conc {
    private String st;

    public Conc2(String name) {
        super();
        st = name;
    }

    public Conc2(int num) throws Exception {
        super(num);
    }


    @Override
    public void apply() {
        st = st.substring(0, st.length() - 1);
    }

    @Override
    public String toString() {
        return st;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Applyable)) return false;
        else if ((o instanceof Conc2))
            return (((Conc2) o).st).equals(st);
        else if ((o instanceof Conc))
            return (((Conc) o).getNum()) == st.length();
        else return false;

    }
}
