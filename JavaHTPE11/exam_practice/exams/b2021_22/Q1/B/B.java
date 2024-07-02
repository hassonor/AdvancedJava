package JavaHTPE11.exam_practice.exams.b2021_22.Q1.B;

public class B extends A{
    private String text;
    public B(int n, String text) throws Exception{
        super(n);
        if(text == null) throw new Exception();
        this.text = text;
    }

    public B(String text) throws Exception{
        this(0,text);
    }

    public String getText(){ return text;}

    public String toString(){
        return "" + getN() + text;
    }


}
