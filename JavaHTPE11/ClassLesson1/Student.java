package JavaHTPE11.ClassLesson1;

public class Student {
    private String _name;
    private String _address;
    private double _avg;
    private String _id;
    private static int _counter = 0;


    public Student(String _name, String _address, double _avg, String _id) {
        super();
        //_counter = 0;//why not?
        //this._counter++;//why not?
        Student._counter++;
        this._name = _name;
        this._address = _address;
        this._avg = _avg;
        this._id = _id;
    }

    public Student() {

        //this._counter++;//why not?
        Student._counter++;

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public double get_avg() {
        return _avg;
    }

    public void set_avg(double _avg) {
        this._avg = _avg;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public static int get_counter() { //!!!!!
        return _counter;
    }

}
