package JavaHTPE11.ClassLesson2_oop_polymorphism.testQuestion;

public class Data implements Computeable {
    private int num = 4;

    public void comp() {
        num--;
    }

    public int getNum() {
        return num;
    }
}
