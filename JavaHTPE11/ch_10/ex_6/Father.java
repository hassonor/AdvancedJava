package JavaHTPE11.ch_10.ex_6;

public class Father extends GrandFather {
    private int _y;

    public Father(int x, int y) {
        super(x);
        _y = y;
    }

    public boolean equals(Father obj) {
        System.out.print("Father: public boolean equals(Father obj)");
        return true;
    }

    public void foo() {
        System.out.print("Father: public void foo()");
    }

    public void foo(String s) {
        System.out.print("Father: public void foo(String s)");
    }
}
