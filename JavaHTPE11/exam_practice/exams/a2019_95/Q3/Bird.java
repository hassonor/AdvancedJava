package JavaHTPE11.exam_practice.exams.a2019_95.Q3;

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

