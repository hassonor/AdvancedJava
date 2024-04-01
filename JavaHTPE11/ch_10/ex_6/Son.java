package JavaHTPE11.ch_10.ex_6;

public class Son extends Father {

    public Son(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.print("Son: public boolean equals(Object obj)");
        return true;
    }

    public boolean equals(Son obj) {
        System.out.print("Son: public boolean equals(Son obj)");
        return true;
    }

    public void foo() {
        System.out.print("Son: public void foo()");
    }

    public void foo(int x) {
        System.out.print("Son: public void foo(int x)");
    }
}
