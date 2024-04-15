package JavaHTPE11.ClassLesson5_Interfaces.ex_4_design_pattern.ex_2;

public class Sequence {

    private Object[] objects;
    private int next = 0;
    MySelector s1;

    public Sequence(int size) {
        objects = new Object[size];
        s1 = new MySelector();
    }

    public void add(Object x) {
        if (next < objects.length)
            objects[next++] = x;
    }

    private class MySelector implements Selector {
        private int i = 0;

        public boolean end() {

            return i == objects.length;
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < objects.length)
//    	  i++; //
                i += 2;
        }

        public Object head() {
            // TODO Auto-generated method stub
            return objects[0];
        }
    }

    public Selector getSelector() {
        return s1;
    }


} ///:~