package JavaHTPE11.ClassLesson2_oop_polymorphism;

public class MathStudent extends Student {

    private double _mathAvg;

    public MathStudent(double _mathAvg) {
        super();
        this._mathAvg = _mathAvg;
    }

    public MathStudent() {
        super();
        this._mathAvg = 666.666;
    }


    public double get_mathAvg() {
        return _mathAvg;
    }

    public void set_mathAvg(double _mathAvg) {
        this._mathAvg = _mathAvg;
    }


}
