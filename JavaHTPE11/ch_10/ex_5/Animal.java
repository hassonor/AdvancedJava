package JavaHTPE11.ch_10.ex_5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public void move() {
        System.out.println("Animal move...");
    }

    public void makeSound() {
        System.out.print("Animal make sound...");
    }
}
