package JavaHTPE11.exam_practice.exams.b2019_83.Q1;

public class TestNumber {
    private int a;
    public int b;
    static int c;

    public Number getNumber() {
        final int var = 0;
        return new Number() {
            @Override
            public double doubleValue() {
                return var;
            }

            @Override
            public float floatValue() {
                return a;
            }

            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return c;
            }
        };
    }
}
