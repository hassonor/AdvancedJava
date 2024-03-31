package JavaHTPE11.cloneExample;

public class Z implements Cloneable {
    X xObj;
    Y yObj;

    public Z() {
        xObj = new X();
        yObj = new Y();
    }

    @Override
    public String toString() {
        return "xObj[" + xObj + "], yObj[" + yObj + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Z cloneZ = (Z) super.clone();
        cloneZ.xObj = (X) xObj.clone();
        cloneZ.yObj = (Y) yObj.clone();
        return cloneZ;
    }
}
