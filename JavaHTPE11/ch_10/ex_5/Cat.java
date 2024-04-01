package JavaHTPE11.ch_10.ex_5;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public String toString() {
        return "Cat" + super.toString();
    }

    public void move() {
        System.out.println("Climb");
    }

    public void makeSound() {
        System.out.println("Meaw");
    }
}
