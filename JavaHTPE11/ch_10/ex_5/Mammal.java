package JavaHTPE11.ch_10.ex_5;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return "Mammal" + super.toString();
    }

    public void move() {
        System.out.println("Mammal move...");
    }

    public void makeSound() {
        System.out.println("Mammal make sound...");
    }
}
