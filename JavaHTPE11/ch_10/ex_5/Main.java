package JavaHTPE11.ch_10.ex_5;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Pistuk");

        Animal b = new HuntingDog("Sunny");

        a.makeSound();
        a.move();
        b.move();

        // Dog c = new Cat("Gingi"); // Error
        // Dog d = new Animal("Test"); // Error
        // Cat f = new Dog("Test"); // Error
        // HuntingDog e = new Dog("Test"); // Error
    }
}
