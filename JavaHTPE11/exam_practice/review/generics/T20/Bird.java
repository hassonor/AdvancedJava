package JavaHTPE11.exam_practice.review.generics.T20;

public class Bird extends Animal {
    private String food;

    public Bird(int id, String name, int age, String food) {
        super(id, name, age);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}


