package JavaHTPE11.exam_practice.exams.a2022_24.Q1.B;

import java.util.ArrayList;

public class Data implements Cloneable {
    private ArrayList<String> list = new ArrayList<String>();

    public void add(String st) {
        list.add(st);
    }

    public void remove() {
        list.remove(0);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Data d = (Data) super.clone();
        d.list = (ArrayList<String>) list.clone();
        return d;
    }
    
}