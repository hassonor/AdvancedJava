package JavaHTPE11.ch_10.ex_7;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Mammal" + super.toString();
    }

}
