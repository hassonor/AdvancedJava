package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q3;

public abstract class Item {
    private String serialNo;
    private double price;

    public Item(String serialNo, double price) {
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

