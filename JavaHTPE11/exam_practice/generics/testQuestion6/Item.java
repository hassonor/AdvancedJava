package JavaHTPE11.exam_practice.generics.testQuestion6;

public abstract class Item {
    private String serialNo;
    private double price;

    public Item(String serialNo, int price) {
        this.serialNo = serialNo;
        this.price = price;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public double getPrice() {
        return price;
    }
}
