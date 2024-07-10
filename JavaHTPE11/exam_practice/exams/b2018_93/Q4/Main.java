package JavaHTPE11.exam_practice.exams.b2018_93.Q4;

public class Main {
    public static void main(String[] args) {
        ResourceManager rm = new ResourceManager(3); // Maximum 3 resources simultaneously
        User user1 = new User(rm);
        User user2 = new User(rm);

        user1.start();
        user2.start();
    }
}

