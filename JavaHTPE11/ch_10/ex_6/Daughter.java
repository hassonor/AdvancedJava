package JavaHTPE11.ch_10.ex_6;

public class Daughter extends Father {

    public Daughter(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.print("Daughter: public boolean equals(Object obj)");
        return true;
    }

    public void bar(int x, int y) {
        System.out.print("Daughter: public void bar(int x, int y)");
    }
}
