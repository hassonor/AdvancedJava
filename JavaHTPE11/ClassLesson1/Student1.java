package JavaHTPE11.ClassLesson1;

public class Student1 {
    private String _fname;
    private String _lname;
    private char _gen;
    private double _avg;

    public String get_fname() {
        return _fname;
    }

    public void set_fname(String _fname) {
        this._fname = _fname;
    }

    public String get_lname() {
        return _lname;
    }

    public void set_lname(String _lname) {
        this._lname = _lname;
    }

    public char get_gen() {
        return _gen;
    }

    public void set_gen(char _gen) {
        this._gen = _gen;
    }

    public double get_avg() {
        return _avg;
    }

    public void set_avg(double _avg) {
        this._avg = _avg;
    }

    public Student1(String _fname, String _lname, char _gen, double _avg) {
        super();
        this._fname = _fname;
        this._lname = _lname;
        this._gen = _gen;
        this._avg = _avg;
    }

    public Student1() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Name: " + this.get_fname() + " " + this.get_lname();
    }

}
