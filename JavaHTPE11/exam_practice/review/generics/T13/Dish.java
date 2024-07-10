package JavaHTPE11.exam_practice.review.generics.T13;

public abstract class Dish {
    private String name;
    private int price;

    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

