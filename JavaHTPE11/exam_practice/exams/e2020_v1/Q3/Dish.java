package JavaHTPE11.exam_practice.exams.e2020_v1.Q3;

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
