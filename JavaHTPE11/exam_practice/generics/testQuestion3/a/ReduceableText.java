package JavaHTPE11.exam_practice.generics.testQuestion3.a;

public class ReduceableText implements Reduceable {
    private String text;

    public ReduceableText(String text) {
        this.text = text;
    }


    @Override
    public void reduce() throws NonReduceable {
        int index = text.indexOf(' ');
        if (index != -1)
            text = text.substring(0, index) + text.substring(index + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ReduceableText))
            return false;
        return text.equals(((ReduceableText) o).text);
    }
}
