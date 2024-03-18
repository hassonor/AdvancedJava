package JavaHTPE11.ch_8;

public class PackageDataTest {
    public static void main(String[] args) {


        PackageData packageData = new PackageData();
        System.out.printf("After instantiation:%n%s%n", packageData);

        packageData.number = 777;
        packageData.string = "Hey, My name is Or Hasson";
        System.out.printf("%nAfter changing values: %n%s%n", packageData);

    }
}

class PackageData {
    int number = 0;
    String string = "Hello";

    public String toString() {
        return String.format("number: %d; string %s", number, string);
    }
}
