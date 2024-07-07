package JavaHTPE11.exam_practice.exams.a2019_86.Q3;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

public class ReduceableText implements Reduceable {
    private String str;

    public ReduceableText(String str) {
        this.str = str;
    }

    @Override
    public void reduce() throws NonReduceable {
        int index = str.indexOf(' ');
        if (index == -1)
            throw new NonReduceable();
        str = str.substring(0, index) + str.substring(index + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ReduceableText))
            return false;
        ReduceableText rt = (ReduceableText) o;
        return str.equals(rt.str);
    }

}
