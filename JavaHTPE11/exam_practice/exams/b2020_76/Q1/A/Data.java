package JavaHTPE11.exam_practice.exams.b2020_76.Q1.A;

public class Data implements Computeable {
    private int num;

    public Data(int num) {
        this.num = num;
    }

    @Override
    public void comp() {
        if (num % 2 == 1) num = num - 1;
    }

    public boolean equals(Data d) {
        System.out.println("Data");
        if (!(d instanceof Data))
            return false;
        return num == d.num;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("new equals");
        if (!(o instanceof Data))
            return false;
        return num == ((Data) o).num;
    }


    public int getNum() {
        return num;
    }

}
