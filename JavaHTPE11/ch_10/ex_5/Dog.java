package JavaHTPE11.ch_10.ex_5;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Dog Walk");
    }

    public void makeSound() {
        System.out.println("Woof");
    }

}
