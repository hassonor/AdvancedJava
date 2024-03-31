package JavaHTPE11.cloneExample;

public class X implements Cloneable {
    int x = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "x: " + x;
    }
}
