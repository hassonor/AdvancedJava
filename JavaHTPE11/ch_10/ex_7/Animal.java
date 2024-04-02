package JavaHTPE11.ch_10.ex_7;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    public abstract void move();

    public abstract void makeSound();
}
