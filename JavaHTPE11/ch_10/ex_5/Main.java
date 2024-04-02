package JavaHTPE11.ch_10.ex_5;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Pistuk");

        Animal b = new HuntingDog("Sunny");

        a.makeSound();
        a.move();
        b.move();

        Animal[] arr = new Animal[3];
        arr[0] = new Cat("Kitti");
        arr[1] = new Mammal("someMammal");
        arr[2] = new HuntingDog("Sunny");
        for (Animal currentAnimal : arr) {
            if (currentAnimal instanceof HuntingDog)
                ((HuntingDog) currentAnimal).hunt();
            currentAnimal.move();
        }

        // Dog c = new Cat("Gingi"); // Error
        // Dog d = new Animal("Test"); // Error
        // Cat f = new Dog("Test"); // Error
        // HuntingDog e = new Dog("Test"); // Error
    }
}
