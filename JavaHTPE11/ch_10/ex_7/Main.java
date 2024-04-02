package JavaHTPE11.ch_10.ex_7;

public class Main {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Cat("Kitti");
        arr[1] = new Dog("Pistuk");
        arr[2] = new HuntingDog("Sunny");
        for (Animal currentAnimal : arr) {
            currentAnimal.move();
        }
    }
}
