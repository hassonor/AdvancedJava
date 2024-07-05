package JavaHTPE11.exam_practice.exams.a2000_example.Q1;

public class Value {
    private int num = 0;

    private static int internal_id;

    private int id;

    public Value() throws Exception {
        this(1);
        System.out.println("Value constructor 1");
    }

    public Value(int num) throws Exception {
        System.out.println("Value constructor 2");
        if (num < 0 || num > 100)
            throw new Exception();
        this.num = num;
        internal_id = ++id;
    }

    public String toString() {
        return "" + num;
    }

    public void transform() {
        System.out.println("Value transform");
        if (num % 2 == 0) num = num / 2;
        else num = num + 1;
    }
}
